package X;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Locale;

/* renamed from: X.OJg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61696OJg implements Externalizable {
    public String LJLIL;
    public String LJLILLLLZI;
    public C61695OJf LJLJI;

    public C61696OJg() {
        this.LJLIL = "application";
        this.LJLILLLLZI = "*";
        this.LJLJI = new C61695OJf();
    }

    public String getBaseType() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLIL);
        LIZ.append("/");
        LIZ.append(this.LJLILLLLZI);
        return X1D.LIZIZ(LIZ);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(getBaseType());
        LIZ.append(this.LJLJI.toString());
        return X1D.LIZIZ(LIZ);
    }

    public C61695OJf getParameters() {
        return this.LJLJI;
    }

    public String getPrimaryType() {
        return this.LJLIL;
    }

    public String getSubType() {
        return this.LJLILLLLZI;
    }

    public C61696OJg(String str) {
        LIZIZ(str);
    }

    public static boolean LIZ(String str) {
        int length = str.length();
        if (length <= 0) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt <= ' ' || charAt >= 127 || "()<>@,;:/[]?=\\\"".indexOf(charAt) >= 0) {
                return false;
            }
        }
        return true;
    }

    public final void LIZIZ(String str) {
        int indexOf = str.indexOf(47);
        int indexOf2 = str.indexOf(59);
        if (indexOf < 0) {
            if (indexOf2 >= 0) {
                throw new C61697OJh("Unable to find a sub type.");
            }
            throw new C61697OJh("Unable to find a sub type.");
        }
        if (indexOf >= 0 && indexOf2 < 0) {
            String trim = str.substring(0, indexOf).trim();
            Locale locale = Locale.ENGLISH;
            this.LJLIL = trim.toLowerCase(locale);
            this.LJLILLLLZI = str.substring(indexOf + 1).trim().toLowerCase(locale);
            this.LJLJI = new C61695OJf();
        } else if (indexOf < indexOf2) {
            String trim2 = str.substring(0, indexOf).trim();
            Locale locale2 = Locale.ENGLISH;
            this.LJLIL = trim2.toLowerCase(locale2);
            this.LJLILLLLZI = str.substring(indexOf + 1, indexOf2).trim().toLowerCase(locale2);
            this.LJLJI = new C61695OJf(str.substring(indexOf2));
        } else {
            throw new C61697OJh("Unable to find a sub type.");
        }
        if (LIZ(this.LJLIL)) {
            if (LIZ(this.LJLILLLLZI)) {
                return;
            } else {
                throw new C61697OJh("Sub type is invalid.");
            }
        }
        throw new C61697OJh("Primary type is invalid.");
    }

    public String getParameter(String str) {
        return (String) this.LJLJI.LIZ.get(str.trim().toLowerCase(Locale.ENGLISH));
    }

    public boolean match(C61696OJg c61696OJg) {
        if (this.LJLIL.equals(c61696OJg.getPrimaryType()) && (this.LJLILLLLZI.equals("*") || c61696OJg.getSubType().equals("*") || this.LJLILLLLZI.equals(c61696OJg.getSubType()))) {
            return true;
        }
        return false;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) {
        try {
            LIZIZ(objectInput.readUTF());
        } catch (C61697OJh e) {
            throw new IOException(e.toString());
        }
    }

    public void removeParameter(String str) {
        this.LJLJI.LIZ.remove(str.trim().toLowerCase(Locale.ENGLISH));
    }

    public void setPrimaryType(String str) {
        if (LIZ(this.LJLIL)) {
            this.LJLIL = str.toLowerCase(Locale.ENGLISH);
            return;
        }
        throw new C61697OJh("Primary type is invalid.");
    }

    public void setSubType(String str) {
        if (LIZ(this.LJLILLLLZI)) {
            this.LJLILLLLZI = str.toLowerCase(Locale.ENGLISH);
            return;
        }
        throw new C61697OJh("Sub type is invalid.");
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeUTF(toString());
        objectOutput.flush();
    }

    public boolean match(String str) {
        return match(new C61696OJg(str));
    }

    public C61696OJg(String str, String str2) {
        if (LIZ(str)) {
            Locale locale = Locale.ENGLISH;
            this.LJLIL = str.toLowerCase(locale);
            if (LIZ(str2)) {
                this.LJLILLLLZI = str2.toLowerCase(locale);
                this.LJLJI = new C61695OJf();
                return;
            }
            throw new C61697OJh("Sub type is invalid.");
        }
        throw new C61697OJh("Primary type is invalid.");
    }

    public void setParameter(String str, String str2) {
        this.LJLJI.LIZ.put(str.trim().toLowerCase(Locale.ENGLISH), str2);
    }
}
