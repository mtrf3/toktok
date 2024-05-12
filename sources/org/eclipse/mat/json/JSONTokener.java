package org.eclipse.mat.json;

import X.X1D;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* loaded from: classes12.dex */
public class JSONTokener {
    public final String in;
    public int pos;

    public static int dehexchar(char c) {
        if (c < '0') {
            return -1;
        }
        if (c <= '9') {
            return c - '0';
        }
        char c2 = 'A';
        if (c < 'A') {
            return -1;
        }
        if (c > 'F') {
            c2 = 'a';
            if (c < 'a' || c > 'f') {
                return -1;
            }
        }
        return (c - c2) + 10;
    }

    private int nextCleanInternal() {
        while (this.pos < this.in.length()) {
            String str = this.in;
            int i = this.pos;
            this.pos = i + 1;
            char charAt = str.charAt(i);
            if (charAt != '\t' && charAt != '\n' && charAt != '\r' && charAt != ' ') {
                if (charAt != '/') {
                    return charAt;
                }
                if (this.pos == this.in.length()) {
                    return charAt;
                }
                char charAt2 = this.in.charAt(this.pos);
                if (charAt2 != '*' && charAt2 != '/') {
                    return charAt;
                }
                skipComment();
            }
        }
        return -1;
    }

    private JSONArray readArray() {
        JSONArray jSONArray = new JSONArray();
        boolean z = false;
        while (true) {
            int nextCleanInternal = nextCleanInternal();
            if (nextCleanInternal != -1) {
                if (nextCleanInternal != 44 && nextCleanInternal != 59) {
                    if (nextCleanInternal != 93) {
                        this.pos--;
                        jSONArray.put(nextValue());
                        int nextCleanInternal2 = nextCleanInternal();
                        if (nextCleanInternal2 != 44 && nextCleanInternal2 != 59) {
                            if (nextCleanInternal2 == 93) {
                                return jSONArray;
                            }
                            throw syntaxError("Unterminated array");
                        }
                    } else {
                        if (z) {
                            jSONArray.put((Object) null);
                        }
                        return jSONArray;
                    }
                } else {
                    jSONArray.put((Object) null);
                }
                z = true;
            } else {
                throw syntaxError("Unterminated array");
            }
        }
    }

    private char readEscapeCharacter() {
        String str = this.in;
        int i = this.pos;
        this.pos = i + 1;
        char charAt = str.charAt(i);
        if (charAt != 'b') {
            if (charAt != 'f') {
                if (charAt != 'n') {
                    if (charAt != 'r') {
                        if (charAt != 't') {
                            if (charAt != 'u') {
                                return charAt;
                            }
                            if (this.pos + 4 <= this.in.length()) {
                                String str2 = this.in;
                                int i2 = this.pos;
                                String substring = str2.substring(i2, i2 + 4);
                                this.pos += 4;
                                return (char) CastIntegerProtector.parseInt(substring, 16);
                            }
                            throw syntaxError("Unterminated escape sequence");
                        }
                        return '\t';
                    }
                    return '\r';
                }
                return '\n';
            }
            return '\f';
        }
        return '\b';
    }

    private JSONObject readObject() {
        JSONObject jSONObject = new JSONObject();
        int nextCleanInternal = nextCleanInternal();
        if (nextCleanInternal == 125) {
            return jSONObject;
        }
        if (nextCleanInternal != -1) {
            this.pos--;
        }
        while (true) {
            Object nextValue = nextValue();
            if (!(nextValue instanceof String)) {
                if (nextValue == null) {
                    throw syntaxError("Names cannot be null");
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Names must be strings, but ");
                LIZ.append(nextValue);
                LIZ.append(" is of type ");
                LIZ.append(nextValue.getClass().getName());
                throw syntaxError(X1D.LIZIZ(LIZ));
            }
            int nextCleanInternal2 = nextCleanInternal();
            if (nextCleanInternal2 == 58 || nextCleanInternal2 == 61) {
                if (this.pos < this.in.length() && this.in.charAt(this.pos) == '>') {
                    this.pos++;
                }
                jSONObject.put((String) nextValue, nextValue());
                int nextCleanInternal3 = nextCleanInternal();
                if (nextCleanInternal3 != 44 && nextCleanInternal3 != 59) {
                    if (nextCleanInternal3 == 125) {
                        return jSONObject;
                    }
                    throw syntaxError("Unterminated object");
                }
            } else {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Expected ':' after ");
                LIZ2.append(nextValue);
                throw syntaxError(X1D.LIZIZ(LIZ2));
            }
        }
    }

    private void skipComment() {
        String str = this.in;
        int i = this.pos;
        this.pos = i + 1;
        if (str.charAt(i) == '*') {
            int indexOf = this.in.indexOf("*/", this.pos);
            if (indexOf != -1) {
                this.pos = indexOf + 2;
                return;
            }
            throw syntaxError("Unterminated comment");
        }
        while (this.pos < this.in.length()) {
            char charAt = this.in.charAt(this.pos);
            if (charAt == '\r' || charAt == '\n') {
                this.pos++;
                return;
            }
            this.pos++;
        }
    }

    public void back() {
        int i = this.pos - 1;
        this.pos = i;
        if (i == -1) {
            this.pos = 0;
        }
    }

    public boolean more() {
        if (this.pos < this.in.length()) {
            return true;
        }
        return false;
    }

    public char next() {
        if (this.pos < this.in.length()) {
            String str = this.in;
            int i = this.pos;
            this.pos = i + 1;
            return str.charAt(i);
        }
        return (char) 0;
    }

    private Object readLiteral() {
        String substring;
        int i;
        String nextToInternal = nextToInternal("{}[]/\\:,=;# \t\f");
        if (nextToInternal.length() != 0) {
            if ("null".equalsIgnoreCase(nextToInternal)) {
                return JSONObject.NULL;
            }
            if ("true".equalsIgnoreCase(nextToInternal)) {
                return Boolean.TRUE;
            }
            if ("false".equalsIgnoreCase(nextToInternal)) {
                return Boolean.FALSE;
            }
            if (nextToInternal.indexOf(46) == -1) {
                if (nextToInternal.startsWith("0x") || nextToInternal.startsWith("0X")) {
                    substring = nextToInternal.substring(2);
                    i = 16;
                } else if (nextToInternal.startsWith(CardStruct.IStatusCode.DEFAULT) && nextToInternal.length() > 1) {
                    substring = nextToInternal.substring(1);
                    i = 8;
                } else {
                    i = 10;
                    substring = nextToInternal;
                }
                try {
                    long parseLong = CastLongProtector.parseLong(substring, i);
                    if (parseLong <= 2147483647L && parseLong >= -2147483648L) {
                        return Integer.valueOf((int) parseLong);
                    }
                    return Long.valueOf(parseLong);
                } catch (NumberFormatException unused) {
                }
            }
            try {
                return CastDoubleProtector.valueOf(nextToInternal);
            } catch (NumberFormatException unused2) {
                return new String(nextToInternal);
            }
        }
        throw syntaxError("Expected literal value");
    }

    public char nextClean() {
        int nextCleanInternal = nextCleanInternal();
        if (nextCleanInternal == -1) {
            return (char) 0;
        }
        return (char) nextCleanInternal;
    }

    public Object nextValue() {
        int nextCleanInternal = nextCleanInternal();
        if (nextCleanInternal != -1) {
            if (nextCleanInternal != 34 && nextCleanInternal != 39) {
                if (nextCleanInternal != 91) {
                    if (nextCleanInternal != 123) {
                        this.pos--;
                        return readLiteral();
                    }
                    return readObject();
                }
                return readArray();
            }
            return nextString((char) nextCleanInternal);
        }
        throw syntaxError("End of input");
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" at character ");
        LIZ.append(this.pos);
        LIZ.append(" of ");
        LIZ.append(this.in);
        return X1D.LIZIZ(LIZ);
    }

    public JSONTokener(String str) {
        this.in = str;
    }

    private String nextToInternal(String str) {
        int i = this.pos;
        while (this.pos < this.in.length()) {
            char charAt = this.in.charAt(this.pos);
            if (charAt == '\r' || charAt == '\n' || str.indexOf(charAt) != -1) {
                return this.in.substring(i, this.pos);
            }
            this.pos++;
        }
        return this.in.substring(i);
    }

    public String next(int i) {
        if (this.pos + i <= this.in.length()) {
            String str = this.in;
            int i2 = this.pos;
            String substring = str.substring(i2, i2 + i);
            this.pos += i;
            return substring;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(i);
        LIZ.append(" is out of bounds");
        throw syntaxError(X1D.LIZIZ(LIZ));
    }

    public String nextString(char c) {
        int i = this.pos;
        StringBuilder sb = null;
        while (this.pos < this.in.length()) {
            String str = this.in;
            int i2 = this.pos;
            this.pos = i2 + 1;
            char charAt = str.charAt(i2);
            if (charAt == c) {
                if (sb == null) {
                    return new String(this.in.substring(i, this.pos - 1));
                }
                sb.append((CharSequence) this.in, i, this.pos - 1);
                return sb.toString();
            }
            if (charAt == '\\') {
                if (this.pos != this.in.length()) {
                    if (sb == null) {
                        sb = new StringBuilder();
                    }
                    sb.append((CharSequence) this.in, i, this.pos - 1);
                    sb.append(readEscapeCharacter());
                    i = this.pos;
                } else {
                    throw syntaxError("Unterminated escape sequence");
                }
            }
        }
        throw syntaxError("Unterminated string");
    }

    public String nextTo(char c) {
        return nextToInternal(String.valueOf(c)).trim();
    }

    public void skipPast(String str) {
        int length;
        int indexOf = this.in.indexOf(str, this.pos);
        if (indexOf == -1) {
            length = this.in.length();
        } else {
            length = str.length() + indexOf;
        }
        this.pos = length;
    }

    public char skipTo(char c) {
        int indexOf = this.in.indexOf(c, this.pos);
        if (indexOf != -1) {
            this.pos = indexOf;
            return c;
        }
        return (char) 0;
    }

    public JSONException syntaxError(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(this);
        return new JSONException(X1D.LIZIZ(LIZ));
    }

    public char next(char c) {
        char next = next();
        if (next == c) {
            return next;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Expected ");
        LIZ.append(c);
        LIZ.append(" but was ");
        LIZ.append(next);
        throw syntaxError(X1D.LIZIZ(LIZ));
    }

    public String nextTo(String str) {
        if (str != null) {
            return nextToInternal(str).trim();
        }
        throw null;
    }
}
