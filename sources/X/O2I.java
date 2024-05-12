package X;

import Y.ACallableS39S1200000_10;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class O2I extends InputStream {
    public boolean LJLIL;
    public final List<Byte> LJLILLLLZI;
    public boolean LJLJI;
    public final O2Z LJLJJI;
    public final InputStream LJLJJL;

    @Override // java.io.InputStream
    public final int available() {
        try {
            return this.LJLJJL.available();
        } catch (Exception e) {
            LIZ(e);
            throw e;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.LJLJJL.close();
            if (this.LJLIL) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("res_src", this.LJLJJI.LJI);
                String LJIJJ = C79043V0l.LJIJJ(this.LJLJJI.LJI, "channel");
                if (LJIJJ != null) {
                    jSONObject.put("res_channel", LJIJJ);
                }
                jSONObject.put("res_state", "success");
                jSONObject.put("res_from", this.LJLJJI.LIZ());
                O2Z o2z = this.LJLJJI;
                String str = o2z.LJFF;
                C79605VMb c79605VMb = new C79605VMb("hybrid_monitor_resource_consume");
                String str2 = o2z.LJ;
                if (str2 == null) {
                    str2 = "hybridkit_default_bid";
                }
                c79605VMb.LIZIZ = str2;
                c79605VMb.LIZLLL = jSONObject;
                FD5.LJ(str, c79605VMb.LIZ());
                if (o.LJ(this.LJLJJI.LJIJJ, "template") && this.LJLJI) {
                    C61250O2c c61250O2c = C61271O2x.LIZ;
                    String str3 = this.LJLJJI.LJIJ;
                    if (str3 == null) {
                        str3 = "";
                    }
                    List<Byte> origin = this.LJLILLLLZI;
                    c61250O2c.getClass();
                    o.LJIIJ(origin, "origin");
                    if (str3.length() != 0 && !((ArrayList) origin).isEmpty()) {
                        C10K.LIZIZ(new ACallableS39S1200000_10(c61250O2c, origin, str3, 1), C10K.LJI, null);
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
            return this.LJLJJL.markSupported();
        } catch (Exception e) {
            LIZ(e);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        try {
            int read = this.LJLJJL.read();
            O2Z o2z = this.LJLJJI;
            if (!o2z.LJIJJLI) {
                this.LJLJI = false;
                return read;
            }
            if (read != -1 && C61271O2x.LIZ.LIZ(o2z.LJIJ) == null) {
                try {
                    ((ArrayList) this.LJLILLLLZI).add(Byte.valueOf((byte) read));
                } catch (OutOfMemoryError unused) {
                    ((ArrayList) this.LJLILLLLZI).clear();
                    this.LJLJI = false;
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
            this.LJLJJL.reset();
        } catch (Exception e) {
            LIZ(e);
            throw e;
        }
    }

    public final void LIZ(Exception exc) {
        this.LJLIL = false;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("res_src", this.LJLJJI.LJI);
        String LJIJJ = C79043V0l.LJIJJ(this.LJLJJI.LJI, "channel");
        if (LJIJJ != null) {
            jSONObject.put("res_channel", LJIJJ);
        }
        jSONObject.put("res_state", "failed");
        jSONObject.put("res_from", this.LJLJJI.LIZ());
        jSONObject.put("res_message", exc.getMessage());
        O2Z o2z = this.LJLJJI;
        String str = o2z.LJFF;
        C79605VMb c79605VMb = new C79605VMb("hybrid_monitor_resource_consume");
        String str2 = o2z.LJ;
        if (str2 == null) {
            str2 = "hybridkit_default_bid";
        }
        c79605VMb.LIZIZ = str2;
        c79605VMb.LIZLLL = jSONObject;
        FD5.LJ(str, c79605VMb.LIZ());
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        try {
            this.LJLJJL.mark(i);
        } catch (Exception e) {
            LIZ(e);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        try {
            int read = this.LJLJJL.read(bArr);
            O2Z o2z = this.LJLJJI;
            if (!o2z.LJIJJLI) {
                this.LJLJI = false;
                return read;
            }
            if (bArr != null && bArr.length != 0 && read > 0 && C61271O2x.LIZ.LIZ(o2z.LJIJ) == null) {
                try {
                    if (read == bArr.length) {
                        ((ArrayList) this.LJLILLLLZI).addAll(ORY.LJJLJLI(bArr));
                    } else {
                        ((ArrayList) this.LJLILLLLZI).addAll(ORY.LJJLJLI(bArr).subList(0, read));
                    }
                } catch (OutOfMemoryError unused) {
                    ((ArrayList) this.LJLILLLLZI).clear();
                    this.LJLJI = false;
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
            return this.LJLJJL.skip(j);
        } catch (Exception e) {
            LIZ(e);
            throw e;
        }
    }

    public O2I(O2Z info, InputStream inputStream) {
        o.LJIIJ(info, "info");
        this.LJLJJI = info;
        this.LJLJJL = inputStream;
        this.LJLIL = true;
        this.LJLILLLLZI = new ArrayList();
        this.LJLJI = true;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        try {
            int read = this.LJLJJL.read(bArr, i, i2);
            O2Z o2z = this.LJLJJI;
            if (!o2z.LJIJJLI) {
                this.LJLJI = false;
                return read;
            }
            if (bArr != null && bArr.length != 0 && read > 0 && C61271O2x.LIZ.LIZ(o2z.LJIJ) == null) {
                try {
                    if (read == bArr.length) {
                        ((ArrayList) this.LJLILLLLZI).addAll(ORY.LJJLJLI(bArr));
                    } else {
                        ((ArrayList) this.LJLILLLLZI).addAll(ORY.LJJLJLI(bArr).subList(0, read));
                    }
                } catch (OutOfMemoryError unused) {
                    ((ArrayList) this.LJLILLLLZI).clear();
                    this.LJLJI = false;
                }
            }
            return read;
        } catch (Exception e) {
            LIZ(e);
            throw e;
        }
    }
}
