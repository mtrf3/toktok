package X;

import Y.ACallableS39S1200000_10;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class O1X extends InputStream {
    public final C60547NpX LJLIL;
    public boolean LJLILLLLZI;
    public final List<Byte> LJLJI;
    public boolean LJLJJI;
    public final O1W LJLJJL;
    public final InputStream LJLJJLL;

    @Override // java.io.InputStream
    public final int available() {
        try {
            return this.LJLJJLL.available();
        } catch (Exception e) {
            LIZ(e);
            throw e;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.LJLJJLL.close();
            if (this.LJLILLLLZI) {
                C60547NpX c60547NpX = this.LJLIL;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("res_state", "success");
                jSONObject.put("res_from", this.LJLJJL.LIZ());
                c60547NpX.LJI = jSONObject;
                InterfaceC60276NlA interfaceC60276NlA = (InterfaceC60276NlA) C60373Nmj.LIZIZ().LIZ(InterfaceC60276NlA.class);
                if (interfaceC60276NlA != null) {
                    interfaceC60276NlA.LJ(this.LJLIL);
                }
                if (o.LJ(this.LJLJJL.LJIL, "template") && this.LJLJJI) {
                    C61243O1v c61243O1v = C61242O1u.LIZ;
                    String str = this.LJLJJL.LJIIZILJ;
                    if (str == null) {
                        str = "";
                    }
                    List<Byte> origin = this.LJLJI;
                    c61243O1v.getClass();
                    o.LJIIJ(origin, "origin");
                    if (str.length() != 0 && !((ArrayList) origin).isEmpty()) {
                        C10K.LIZIZ(new ACallableS39S1200000_10(c61243O1v, origin, str, 0), C10K.LJI, null);
                    }
                }
            }
        } catch (Exception e) {
            LIZ(e);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        try {
            return this.LJLJJLL.markSupported();
        } catch (Exception e) {
            LIZ(e);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        try {
            int read = this.LJLJJLL.read();
            O1W o1w = this.LJLJJL;
            if (!o1w.LJJ) {
                this.LJLJJI = false;
                return read;
            }
            if (read != -1 && C61242O1u.LIZ.LIZ(o1w.LJIIZILJ) == null) {
                try {
                    ((ArrayList) this.LJLJI).add(Byte.valueOf((byte) read));
                } catch (OutOfMemoryError unused) {
                    ((ArrayList) this.LJLJI).clear();
                    this.LJLJJI = false;
                }
            }
            return read;
        } catch (Exception e) {
            LIZ(e);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final void reset() {
        try {
            this.LJLJJLL.reset();
        } catch (Exception e) {
            LIZ(e);
            throw e;
        }
    }

    public final void LIZ(Exception exc) {
        this.LJLILLLLZI = false;
        C60547NpX c60547NpX = this.LJLIL;
        JSONObject LIZJ = C65232Piu.LIZJ("res_state", "failed");
        LIZJ.put("res_from", this.LJLJJL.LIZ());
        LIZJ.put("res_message", exc.getMessage());
        c60547NpX.LJI = LIZJ;
        InterfaceC60276NlA interfaceC60276NlA = (InterfaceC60276NlA) C60373Nmj.LIZIZ().LIZ(InterfaceC60276NlA.class);
        if (interfaceC60276NlA != null) {
            interfaceC60276NlA.LJ(this.LJLIL);
        }
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        try {
            this.LJLJJLL.mark(i);
        } catch (Exception e) {
            LIZ(e);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        try {
            int read = this.LJLJJLL.read(bArr);
            O1W o1w = this.LJLJJL;
            if (!o1w.LJJ) {
                this.LJLJJI = false;
                return read;
            }
            if (bArr != null && bArr.length != 0 && read > 0 && C61242O1u.LIZ.LIZ(o1w.LJIIZILJ) == null) {
                try {
                    if (read == bArr.length) {
                        ((ArrayList) this.LJLJI).addAll(ORY.LJJLJLI(bArr));
                    } else {
                        ((ArrayList) this.LJLJI).addAll(ORY.LJJLJLI(bArr).subList(0, read));
                    }
                } catch (OutOfMemoryError unused) {
                    ((ArrayList) this.LJLJI).clear();
                    this.LJLJJI = false;
                }
            }
            return read;
        } catch (Exception e) {
            LIZ(e);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        try {
            return this.LJLJJLL.skip(j);
        } catch (Exception e) {
            LIZ(e);
            throw e;
        }
    }

    public O1X(O1W info, InputStream inputStream) {
        o.LJIIJ(info, "info");
        this.LJLJJL = info;
        this.LJLJJLL = inputStream;
        this.LJLIL = new C60547NpX("bdx_resourceloader_comsume", null, null, 254);
        this.LJLILLLLZI = true;
        this.LJLJI = new ArrayList();
        this.LJLJJI = true;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        try {
            int read = this.LJLJJLL.read(bArr, i, i2);
            O1W o1w = this.LJLJJL;
            if (!o1w.LJJ) {
                this.LJLJJI = false;
                return read;
            }
            if (bArr != null && bArr.length != 0 && read > 0 && C61242O1u.LIZ.LIZ(o1w.LJIIZILJ) == null) {
                try {
                    if (read == bArr.length) {
                        ((ArrayList) this.LJLJI).addAll(ORY.LJJLJLI(bArr));
                    } else {
                        ((ArrayList) this.LJLJI).addAll(ORY.LJJLJLI(bArr).subList(0, read));
                    }
                } catch (OutOfMemoryError unused) {
                    ((ArrayList) this.LJLJI).clear();
                    this.LJLJJI = false;
                }
            }
            return read;
        } catch (Exception e) {
            LIZ(e);
            throw e;
        }
    }
}
