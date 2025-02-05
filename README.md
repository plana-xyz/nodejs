# Metric Converter

A simple command-line application that converts between different metric units.

## Features

- Supports multiple unit conversions including:
  - Kilometers to Meters
  - Kilograms to Pounds
  - Grams to Ounces
  - Millimeters to Inches
  - Centimeters to Inches
  - Kilometers to Miles

## How to Use

1. Run the program using Java:
   ```
   java index
   ```

2. Enter your conversion query in the format:
   ```
   [value] [from_unit] = [to_unit]
   ```
   For example:
   - `1 km = m`
   - `2.5 kg = lb`
   - `100 g = oz`

3. To exit the program, type either:
   - `exit`
   - `-1`

4. If you enter an unsupported conversion, the program will prompt you with the correct format.

## Running with JAR file

You can also run the program using the provided JAR file:
```
java -jar index.jar
```

## Supported Conversions

- km to m (Kilometers to Meters)
- kg to lb (Kilograms to Pounds)
- g to oz (Grams to Ounces)
- mm to in (Millimeters to Inches)
- cm to in (Centimeters to Inches)
- km to mi (Kilometers to Miles)
