package org.eclipse.mat.json;

import X.C16880lQ;
import X.C64504PTg;
import X.V0N;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes12.dex */
public class JSONStringer {
    public final String indent;
    public final StringBuilder out;
    public final List<Scope> stack;

    private void beforeValue() {
        String str;
        if (this.stack.isEmpty()) {
            return;
        }
        Scope peek = peek();
        if (peek == Scope.EMPTY_ARRAY) {
            replaceTop(Scope.NONEMPTY_ARRAY);
            newline();
            return;
        }
        if (peek == Scope.NONEMPTY_ARRAY) {
            this.out.append(',');
            newline();
        } else {
            if (peek == Scope.DANGLING_KEY) {
                StringBuilder sb = this.out;
                if (this.indent == null) {
                    str = ":";
                } else {
                    str = ": ";
                }
                sb.append(str);
                replaceTop(Scope.NONEMPTY_OBJECT);
                return;
            }
            if (peek == Scope.NULL) {
            } else {
                throw new JSONException("Nesting problem");
            }
        }
    }

    private void newline() {
        if (this.indent == null) {
            return;
        }
        this.out.append("\n");
        for (int i = 0; i < this.stack.size(); i++) {
            this.out.append(this.indent);
        }
    }

    private Scope peek() {
        if (!this.stack.isEmpty()) {
            List<Scope> list = this.stack;
            return (Scope) C64504PTg.LIZIZ(list, -1, list);
        }
        throw new JSONException("Nesting problem");
    }

    public JSONStringer array() {
        open(Scope.EMPTY_ARRAY, "[");
        return this;
    }

    public JSONStringer endArray() {
        close(Scope.EMPTY_ARRAY, Scope.NONEMPTY_ARRAY, "]");
        return this;
    }

    public JSONStringer endObject() {
        close(Scope.EMPTY_OBJECT, Scope.NONEMPTY_OBJECT, "}");
        return this;
    }

    public JSONStringer object() {
        open(Scope.EMPTY_OBJECT, "{");
        return this;
    }

    public String toString() {
        if (this.out.length() == 0) {
            return null;
        }
        return this.out.toString();
    }

    public JSONStringer() {
        this.out = new StringBuilder();
        this.stack = new ArrayList();
        this.indent = null;
    }

    private void beforeKey() {
        Scope peek = peek();
        if (peek == Scope.NONEMPTY_OBJECT) {
            this.out.append(',');
        } else if (peek != Scope.EMPTY_OBJECT) {
            throw new JSONException("Nesting problem");
        }
        newline();
        replaceTop(Scope.DANGLING_KEY);
    }

    /* loaded from: classes12.dex */
    public enum Scope {
        EMPTY_ARRAY,
        NONEMPTY_ARRAY,
        EMPTY_OBJECT,
        DANGLING_KEY,
        NONEMPTY_OBJECT,
        NULL;

        public static Scope valueOf(String str) {
            return (Scope) V0N.LJJJ(Scope.class, str);
        }
    }

    public JSONStringer(int i) {
        this.out = new StringBuilder();
        this.stack = new ArrayList();
        char[] cArr = new char[i];
        Arrays.fill(cArr, ' ');
        this.indent = new String(cArr);
    }

    private void replaceTop(Scope scope) {
        ListProtector.set(this.stack, r1.size() - 1, scope);
    }

    private void string(String str) {
        this.out.append("\"");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt != '\f') {
                if (charAt != '\r') {
                    if (charAt != '\"' && charAt != '/' && charAt != '\\') {
                        switch (charAt) {
                            case '\b':
                                this.out.append("\\b");
                                break;
                            case '\t':
                                this.out.append("\\t");
                                break;
                            case '\n':
                                this.out.append("\\n");
                                break;
                            default:
                                if (charAt <= 31) {
                                    this.out.append(C16880lQ.LLLZ("\\u%04x", new Object[]{Integer.valueOf(charAt)}));
                                    break;
                                } else {
                                    this.out.append(charAt);
                                    break;
                                }
                        }
                    } else {
                        StringBuilder sb = this.out;
                        sb.append('\\');
                        sb.append(charAt);
                    }
                } else {
                    this.out.append("\\r");
                }
            } else {
                this.out.append("\\f");
            }
        }
        this.out.append("\"");
    }

    public JSONStringer key(String str) {
        if (str != null) {
            beforeKey();
            string(str);
            return this;
        }
        throw new JSONException("Names must be non-null");
    }

    public JSONStringer value(Object obj) {
        if (!this.stack.isEmpty()) {
            if (obj instanceof JSONArray) {
                ((JSONArray) obj).writeTo(this);
                return this;
            }
            if (obj instanceof JSONObject) {
                ((JSONObject) obj).writeTo(this);
                return this;
            }
            beforeValue();
            if (obj == null || (obj instanceof Boolean) || obj == JSONObject.NULL) {
                this.out.append(obj);
            } else if (obj instanceof Number) {
                this.out.append(JSONObject.numberToString((Number) obj));
            } else {
                string(obj.toString());
            }
            return this;
        }
        throw new JSONException("Nesting problem");
    }

    public JSONStringer value(double d) {
        if (!this.stack.isEmpty()) {
            beforeValue();
            this.out.append(JSONObject.numberToString(Double.valueOf(d)));
            return this;
        }
        throw new JSONException("Nesting problem");
    }

    public JSONStringer value(long j) {
        if (!this.stack.isEmpty()) {
            beforeValue();
            this.out.append(j);
            return this;
        }
        throw new JSONException("Nesting problem");
    }

    public JSONStringer value(boolean z) {
        if (!this.stack.isEmpty()) {
            beforeValue();
            this.out.append(z);
            return this;
        }
        throw new JSONException("Nesting problem");
    }

    public JSONStringer open(Scope scope, String str) {
        if (!this.stack.isEmpty() || this.out.length() <= 0) {
            beforeValue();
            this.stack.add(scope);
            this.out.append(str);
            return this;
        }
        throw new JSONException("Nesting problem: multiple top-level roots");
    }

    public JSONStringer close(Scope scope, Scope scope2, String str) {
        Scope peek = peek();
        if (peek == scope2 || peek == scope) {
            ListProtector.remove(this.stack, r1.size() - 1);
            if (peek == scope2) {
                newline();
            }
            this.out.append(str);
            return this;
        }
        throw new JSONException("Nesting problem");
    }
}
