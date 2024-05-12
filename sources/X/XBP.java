package X;

import com.ss.ugc.effectplatform.model.Effect;
import kotlin.jvm.internal.AqS197S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XBP implements XB8 {
    public final Effect LIZ;

    public XBP(Effect effect) {
        o.LJIIJ(effect, "effect");
        this.LIZ = effect;
    }

    @Override // X.XB8
    public final String LIZ(C84426XBm c84426XBm, long j, XB7 xb7) {
        String md5;
        InterfaceC84387X9z interfaceC84387X9z;
        String LJII = XBM.LJII(this.LIZ.getZipPath());
        if (LJII != null) {
            InterfaceC84458XCs LIZ = C84395XAh.LIZ(LJII);
            if (LIZ instanceof XBJ) {
                Integer url_sub_type = this.LIZ.getFile_url().getUrl_sub_type();
                if (url_sub_type == null || url_sub_type.intValue() != 1) {
                    md5 = this.LIZ.getFile_url().getUri();
                } else {
                    md5 = this.LIZ.getFile_url().getMd5();
                }
                XBK xbk = (XBK) LIZ;
                Effect effect = this.LIZ;
                AqS197S0100000_15 aqS197S0100000_15 = new AqS197S0100000_15(xb7, 64);
                xbk.getClass();
                o.LJIIJ(effect, "effect");
                XBQ xbq = XBL.LJIJJ;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(effect.getId());
                LIZ2.append(".zip");
                String LIZIZ = X1D.LIZIZ(LIZ2);
                xbq.getClass();
                String LIZJ = XBQ.LIZJ(LIZIZ);
                try {
                    OSZ LJI = xbk.LJI(LIZJ, c84426XBm, md5, j, aqS197S0100000_15);
                    if (((Boolean) LJI.getSecond()).booleanValue() && (interfaceC84387X9z = (InterfaceC84387X9z) XBJ.LJIIIZ.LIZ) != null) {
                        interfaceC84387X9z.putString(effect.getId(), effect.getEffect_id());
                    }
                    C12310e3 c12310e3 = C12310e3.LIZIZ;
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("effect ");
                    LIZ3.append(effect.getEffect_id());
                    LIZ3.append(", name: ");
                    LIZ3.append(effect.getName());
                    LIZ3.append(", key: ");
                    LIZ3.append(LIZJ);
                    LIZ3.append(" end in disklrucache, result: ");
                    LIZ3.append(((Boolean) LJI.getSecond()).booleanValue());
                    String LIZIZ2 = X1D.LIZIZ(LIZ3);
                    c12310e3.getClass();
                    C12310e3.LIZ("EffectDiskLruCache", LIZIZ2);
                    return (String) LJI.getFirst();
                } catch (Exception e) {
                    C12310e3 c12310e32 = C12310e3.LIZIZ;
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("fetch effect: ");
                    LIZ4.append(effect.getEffect_id());
                    LIZ4.append(", name: ");
                    LIZ4.append(effect.getName());
                    LIZ4.append(" key: ");
                    LIZ4.append(LIZJ);
                    LIZ4.append(" write to disk failed!");
                    String LIZIZ3 = X1D.LIZIZ(LIZ4);
                    c12310e32.getClass();
                    C12310e3.LIZIZ("EffectDiskLruCache", LIZIZ3, e);
                    if (!(e instanceof XB1)) {
                        xbk.remove(LIZJ);
                    }
                    throw e;
                }
            }
            XBQ xbq2 = XBL.LJIJJ;
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append(this.LIZ.getId());
            LIZ5.append(".zip");
            String LIZIZ4 = X1D.LIZIZ(LIZ5);
            xbq2.getClass();
            String LIZJ2 = XBQ.LIZJ(LIZIZ4);
            if (LIZ != null) {
                LIZ.LIZJ(LIZJ2, c84426XBm);
            }
            return this.LIZ.getZipPath();
        }
        return null;
    }
}
