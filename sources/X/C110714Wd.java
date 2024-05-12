package X;

import Y.IDcS364S0100000_1;
import com.bytedance.im.core.proto.ConversationApplyInfo;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import kotlin.jvm.internal.o;

/* renamed from: X.4Wd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C110714Wd {
    public IMUser LIZ;
    public String LIZIZ;
    public String LIZJ;
    public C63120Opw LIZLLL;
    public long LJ;
    public EnumC115774gX LJFF = EnumC115774gX.INVALID;
    public String LJI;
    public String LJII;
    public IMUser LJIIIIZZ;
    public java.util.Map<String, String> LJIIIZ;

    public final void LIZ(ConversationApplyInfo model) {
        String str;
        o.LJIIIZ(model, "model");
        this.LIZIZ = String.valueOf(model.user_id);
        this.LIZJ = model.sec_uid;
        Long l = model.apply_id;
        o.LJIIIIZZ(l, "model.apply_id");
        this.LJ = l.longValue();
        this.LJFF = model.apply_status;
        Long l2 = model.create_time;
        o.LJIIIIZZ(l2, "model.create_time");
        l2.longValue();
        Long l3 = model.invite_user_id;
        String str2 = null;
        if (l3 != null) {
            str = String.valueOf(l3);
        } else {
            str = null;
        }
        this.LJI = str;
        String str3 = model.sec_invite_uid;
        if (str3 == null) {
            str3 = null;
        }
        this.LJII = str3;
        this.LJIIIZ = model.ext;
        if (model.user_id != null && this.LIZ == null) {
            C80533Eb.LJIIJJI(this.LIZIZ, this.LIZJ, false, new C3EU() { // from class: X.4We
                @Override // X.C3EU
                public final void LIZ(IMUser result) {
                    o.LJIIIZ(result, "result");
                    C110714Wd.this.LIZ = result;
                }

                @Override // X.C3EU
                public final void LIZIZ(Throwable throwable) {
                    o.LJIIIZ(throwable, "throwable");
                }
            });
        }
        if (model.invite_user_id != null && this.LJIIIIZZ == null) {
            C80533Eb.LJIIJJI(this.LJI, this.LJII, false, new C3EU() { // from class: X.4Wf
                @Override // X.C3EU
                public final void LIZ(IMUser result) {
                    o.LJIIIZ(result, "result");
                    C110714Wd.this.LJIIIIZZ = result;
                }

                @Override // X.C3EU
                public final void LIZIZ(Throwable throwable) {
                    o.LJIIIZ(throwable, "throwable");
                }
            });
        }
        if (model.conv_short_id != null && this.LIZLLL == null) {
            C3Q9.LIZ.getClass();
            C75782yE.LIZ();
            Long l4 = model.conv_short_id;
            if (l4 != null) {
                str2 = String.valueOf(l4);
            }
            C4WC.LJIILLIIL(str2, new IDcS364S0100000_1(this, 5));
        }
    }
}
