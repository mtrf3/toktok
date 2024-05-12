package X;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Locale;

/* renamed from: X.OJa, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61690OJa implements Serializable {
    public static final char[] LJLJI;
    public static final long serialVersionUID = 6374381323722046732L;
    public transient C61691OJb LJLIL;
    public long LJLILLLLZI = System.currentTimeMillis();

    static {
        C16880lQ.LJLLJ(C61690OJa.class);
        LJLJI = "0123456789ABCDEF".toCharArray();
    }

    public String encode() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new ObjectOutputStream(byteArrayOutputStream).writeObject(this);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            char[] cArr = new char[byteArray.length * 2];
            for (int i = 0; i < byteArray.length; i++) {
                int i2 = byteArray[i] & 255;
                int i3 = i * 2;
                char[] cArr2 = LJLJI;
                cArr[i3] = cArr2[i2 >>> 4];
                cArr[i3 + 1] = cArr2[i2 & 15];
            }
            return new String(cArr);
        } catch (IOException unused) {
            return null;
        }
    }

    public Long getWhenCreated() {
        return Long.valueOf(this.LJLILLLLZI);
    }

    public boolean hasExpired() {
        long j = this.LJLIL.LJLJJL;
        if (j == -1 || (System.currentTimeMillis() - this.LJLILLLLZI) / 1000 <= j) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.LJLIL.hashCode();
    }

    public C61691OJb getHttpCookie() {
        return this.LJLIL;
    }

    public C61690OJa(C61691OJb c61691OJb) {
        this.LJLIL = c61691OJb;
    }

    public static C61690OJa decode(String str) {
        if (str != null && !str.isEmpty()) {
            int length = str.length();
            byte[] bArr = new byte[length / 2];
            for (int i = 0; i < length; i += 2) {
                bArr[i / 2] = (byte) (Character.digit(str.charAt(i + 1), 16) + (Character.digit(str.charAt(i), 16) << 4));
            }
            try {
                return (C61690OJa) new C37352ElI(new ByteArrayInputStream(bArr), C61690OJa.class).readObject();
            } catch (IOException | ClassNotFoundException unused) {
            }
        }
        return null;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        String lowerCase;
        C61691OJb c61691OJb = new C61691OJb((String) objectInputStream.readObject(), (String) objectInputStream.readObject());
        this.LJLIL = c61691OJb;
        c61691OJb.LJLIL = (String) objectInputStream.readObject();
        this.LJLIL.LJLILLLLZI = (String) objectInputStream.readObject();
        C61691OJb c61691OJb2 = this.LJLIL;
        String str = (String) objectInputStream.readObject();
        if (str == null) {
            lowerCase = null;
        } else {
            c61691OJb2.getClass();
            lowerCase = str.toLowerCase(Locale.US);
        }
        c61691OJb2.LJLJJI = lowerCase;
        this.LJLIL.LJLJJL = objectInputStream.readLong();
        this.LJLIL.LJLJL = (String) objectInputStream.readObject();
        this.LJLIL.LJLJLJ = (String) objectInputStream.readObject();
        C61691OJb c61691OJb3 = this.LJLIL;
        int readInt = objectInputStream.readInt();
        c61691OJb3.getClass();
        if (readInt == 0 || readInt == 1) {
            c61691OJb3.LJLLILLLL = readInt;
            this.LJLIL.LJLJLLL = objectInputStream.readBoolean();
            this.LJLIL.LJLJI = objectInputStream.readBoolean();
            this.LJLIL.LJLL = objectInputStream.readBoolean();
            this.LJLILLLLZI = objectInputStream.readLong();
            return;
        }
        throw new IllegalArgumentException(KMP.LJ("Bad version: ", readInt));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeObject(this.LJLIL.LJLJJLL);
        objectOutputStream.writeObject(this.LJLIL.LJLLI);
        objectOutputStream.writeObject(this.LJLIL.LJLIL);
        objectOutputStream.writeObject(this.LJLIL.LJLILLLLZI);
        objectOutputStream.writeObject(this.LJLIL.LJLJJI);
        objectOutputStream.writeLong(this.LJLIL.LJLJJL);
        objectOutputStream.writeObject(this.LJLIL.LJLJL);
        objectOutputStream.writeObject(this.LJLIL.LJLJLJ);
        objectOutputStream.writeInt(this.LJLIL.LJLLILLLL);
        objectOutputStream.writeBoolean(this.LJLIL.LJLJLLL);
        objectOutputStream.writeBoolean(this.LJLIL.LJLJI);
        objectOutputStream.writeBoolean(this.LJLIL.LJLL);
        objectOutputStream.writeLong(this.LJLILLLLZI);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C61691OJb) {
            return this.LJLIL.equals(obj);
        }
        if (obj instanceof C61690OJa) {
            return this.LJLIL.equals(((C61690OJa) obj).LJLIL);
        }
        return false;
    }

    public static int getEffectivePort(String str, int i) {
        if (i != -1) {
            return i;
        }
        if ("http".equalsIgnoreCase(str)) {
            return 80;
        }
        if (!"https".equalsIgnoreCase(str)) {
            return -1;
        }
        return 443;
    }
}
