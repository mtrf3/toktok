package X;

import Y.IDCallbackS367S0100000_5;
import android.os.Handler;
import android.os.SystemClock;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.live.publicscreen.impl.PublicScreenService;
import com.bytedance.android.livesdk.livesetting.performance.RoomSlowFunctionOptSetting;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdk.model.message.EmoteChatMessage;
import com.bytedance.android.livesdk.model.message.MemberMessage;
import kotlin.jvm.internal.o;

/* renamed from: X.CTl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31385CTl extends CRC {
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public int LJIILIIL;
    public int LJIILJJIL;
    public int LJIILL;
    public int LJIILLIIL;
    public int LJIIZILJ;
    public int LJIJ;
    public int LJIJI;
    public int LJIJJ;
    public int LJIJJLI;
    public int LJIL;
    public int LJJ;
    public int LJJI;
    public int LJJIFFI;
    public int LJJII;
    public int LJJIII;
    public int LJJIIJ;
    public int LJJIIJZLJL;
    public int LJJIIZ;
    public int LJJIIZI;
    public int LJJIJ;
    public int LJJIJIIJI;
    public long LJJIJIIJIL;
    public long LJJIJL;
    public long LJJIJLIJ;
    public final PublicScreenService LJJIL;
    public final Handler LIZIZ = new Handler(new IDCallbackS367S0100000_5(this, 6));
    public final long LJJIJIL = 60000;

    public void LJJIJLIJ() {
    }

    public abstract void LJJIL();

    @Override // X.InterfaceC31335CRn
    public void LIZ() {
        this.LIZIZ.sendEmptyMessageDelayed(1, this.LJJIJIL);
    }

    @Override // X.CRC, X.CR8
    public void LJJIIZI() {
        this.LJJIJIIJIL++;
    }

    @Override // X.CRC, X.CR8
    public final void LJJIJIIJI() {
        this.LJIJ++;
    }

    public final void LJJIJL() {
        long longValue;
        if (this.LJJIJL > 0) {
            long uptimeMillis = SystemClock.uptimeMillis();
            this.LJJIJLIJ = (uptimeMillis - this.LJJIJL) + this.LJJIJLIJ;
            this.LJJIJL = uptimeMillis;
        }
        LJJIL();
        PublicScreenService publicScreenService = this.LJJIL;
        if (publicScreenService != null) {
            long j = LJJIJIIJIL().LJIIJJI;
            long j2 = this.LJJIJLIJ;
            Long l = publicScreenService.LJLJJL.get(j);
            if (l == null) {
                longValue = 0;
            } else {
                longValue = l.longValue();
            }
            publicScreenService.LJLJJL.put(j, Long.valueOf(longValue + j2));
        }
        this.LJJIJLIJ = 0L;
        this.LIZJ = 0;
        this.LIZLLL = 0;
        this.LJ = 0;
        this.LJIIZILJ = 0;
        this.LJIJI = 0;
        this.LJIJJ = 0;
        this.LJFF = 0;
        this.LJI = 0;
        this.LJII = 0;
        this.LJIIIIZZ = 0;
        this.LJIIIZ = 0;
        this.LJIIJ = 0;
        this.LJIIJJI = 0;
        this.LJIIL = 0;
        this.LJIILIIL = 0;
        this.LJIILJJIL = 0;
        this.LJIILL = 0;
        this.LJIILLIIL = 0;
        this.LJIJJLI = 0;
        this.LJIL = 0;
        this.LJJ = 0;
        this.LJJI = 0;
        this.LJJIFFI = 0;
        this.LJJIIZ = 0;
        this.LJJIIZI = 0;
        this.LJJII = 0;
        this.LJJIII = 0;
        this.LJJIIJ = 0;
        this.LJJIIJZLJL = 0;
        this.LJJIJIIJI = 0;
        this.LJJIJ = 0;
        this.LJJIJIIJIL = 0L;
        this.LJIJ = 0;
        LJJIJLIJ();
    }

    @Override // X.CRC, X.CR8
    public void n6() {
        if (this.LJJIJL > 0) {
            this.LJJIJLIJ = (SystemClock.uptimeMillis() - this.LJJIJL) + this.LJJIJLIJ;
            this.LJJIJL = 0L;
        }
    }

    @Override // X.InterfaceC31335CRn
    public final void onResume() {
        this.LIZIZ.removeCallbacksAndMessages(null);
        this.LIZIZ.sendEmptyMessageDelayed(1, this.LJJIJIL);
    }

    public AbstractC31385CTl() {
        PublicScreenService publicScreenService;
        InterfaceC06390Mx LIZ = CN1.LIZ(IPublicScreenService.class);
        if (LIZ instanceof PublicScreenService) {
            publicScreenService = (PublicScreenService) LIZ;
        } else {
            publicScreenService = null;
        }
        this.LJJIL = publicScreenService;
    }

    public final String LJJIJIL() {
        UserAttr userAttr;
        if (!LJJIJIIJIL().LJFF) {
            User LIZJ = LJJIJIIJIL().LIZJ();
            if (LIZJ != null && (userAttr = LIZJ.getUserAttr()) != null && userAttr.isAdmin) {
                return "admin";
            }
            return "viewer";
        }
        return "anchor";
    }

    @Override // X.InterfaceC31335CRn
    public final void onPause() {
        LJJIJL();
        this.LIZIZ.removeCallbacksAndMessages(null);
    }

    @Override // X.InterfaceC31335CRn
    public final void onUnload() {
        LJJIJL();
        this.LJJIJL = 0L;
        this.LIZIZ.removeCallbacksAndMessages(null);
    }

    @Override // X.CRC, X.CR8
    public void LJIIIIZZ(CRD model) {
        o.LJIIIZ(model, "model");
        if (model instanceof CQ6) {
            this.LJFF++;
        } else if (model instanceof C31290CPu) {
            this.LJI++;
        } else {
            if (model instanceof CQ7) {
                if (((CQ7) model).LLFFF()) {
                    this.LJII++;
                } else if (((CQ7) model).LLFF()) {
                    this.LJIIIIZZ++;
                }
            }
            if ((model instanceof C31276CPg) && ((MemberMessage) ((CQO) model).LJIJJLI).action == 1) {
                this.LJIJJLI++;
            }
        }
        if (model instanceof CQK) {
            MESSAGE message = ((CQO) model).LJIJJLI;
            if ((message instanceof ChatMessage) || (message instanceof EmoteChatMessage)) {
                this.LIZJ++;
                if ((model instanceof CQJ) && ((ChatMessage) ((CQO) model).LJIJJLI).LIZ()) {
                    this.LJ++;
                }
                if (model instanceof CQN) {
                    this.LIZLLL++;
                }
            }
        }
        if (model.LJJJLL().LIZ) {
            this.LJIJI++;
        } else {
            this.LJIJJ++;
        }
        if (model.LJJLIIIJILLIZJL()) {
            this.LJIIIZ++;
        }
    }

    @Override // X.CRC, X.CR8
    public void LJIILIIL(CRD model) {
        o.LJIIIZ(model, "model");
        if (model instanceof CQ6) {
            this.LJJII++;
        } else if (model instanceof C31290CPu) {
            this.LJJIII++;
        } else {
            if (model instanceof CQ7) {
                if (((CQ7) model).LLFFF()) {
                    this.LJJIIJ++;
                } else if (((CQ7) model).LLFF()) {
                    this.LJJIIJZLJL++;
                }
            }
            if ((model instanceof C31276CPg) && ((MemberMessage) ((CQO) model).LJIJJLI).action == 1) {
                this.LJJIJIIJI++;
            }
        }
        if (model instanceof CQK) {
            MESSAGE message = ((CQO) model).LJIJJLI;
            if ((message instanceof ChatMessage) || (message instanceof EmoteChatMessage)) {
                this.LJJ++;
                if ((model instanceof CQJ) && ((ChatMessage) ((CQO) model).LJIJJLI).LIZ()) {
                    this.LJJIFFI++;
                }
                if (model instanceof CQN) {
                    this.LJJI++;
                }
            }
        }
        if (model.LJJJLL().LIZ) {
            this.LJJIIZ++;
        } else {
            this.LJJIIZI++;
        }
        if (model.LJJLIIIJILLIZJL()) {
            this.LJJIJ++;
        }
    }

    @Override // X.CRC, X.CR8
    public void LJIJJ(long j, CRD model) {
        boolean LLIIII;
        o.LJIIIZ(model, "model");
        if (model.LJJIFFI().LIZ == 1 && (model instanceof CQK)) {
            CQK cqk = (CQK) model;
            if (RoomSlowFunctionOptSetting.watchOpt()) {
                LLIIII = ((Boolean) cqk.LJJII.getValue()).booleanValue();
            } else {
                LLIIII = cqk.LLIIII();
            }
            if (LLIIII) {
                this.LJIIZILJ++;
            }
        }
    }

    @Override // X.CR8
    public void LJJIJ(CRD model, boolean z) {
        o.LJIIIZ(model, "model");
        if (model instanceof CQ6) {
            this.LJIIJ++;
            return;
        }
        if (model instanceof C31290CPu) {
            this.LJIIJJI++;
            return;
        }
        if (model instanceof CQ7) {
            if (((CQ7) model).LLFFF()) {
                this.LJIIL++;
                return;
            } else if (((CQ7) model).LLFF()) {
                this.LJIILIIL++;
                return;
            }
        }
        if (model instanceof CQK) {
            MESSAGE message = ((CQO) model).LJIJJLI;
            if ((message instanceof ChatMessage) || (message instanceof EmoteChatMessage)) {
                this.LJIILJJIL++;
            }
            if ((model instanceof CQJ) && ((ChatMessage) ((CQO) model).LJIJJLI).LIZ()) {
                this.LJIILLIIL++;
            }
            if (!(model instanceof CQN)) {
                return;
            }
            this.LJIILL++;
            return;
        }
        if (!(model instanceof C31276CPg) || ((MemberMessage) ((CQO) model).LJIJJLI).action != 1) {
            return;
        }
        this.LJIL++;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0052, code lost:
    
        if ((r7 instanceof com.bytedance.android.livesdk.model.message.EmoteChatMessage) != false) goto L25;
     */
    @Override // X.CR8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LJJ(X.CR6 r7, X.AbstractC31313CQr<X.CR6> r8, boolean r9, com.bytedance.android.live.base.model.user.User r10, boolean r11) {
        /*
            r6 = this;
            java.lang.String r0 = "message"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            boolean r0 = r7 instanceof com.bytedance.android.livesdk.model.message.LikeMessage
            r5 = 1
            if (r0 == 0) goto L11
            int r0 = r6.LJIIJ
            int r0 = r0 + 1
            r6.LJIIJ = r0
        L10:
            return
        L11:
            boolean r0 = r7 instanceof com.bytedance.android.livesdk.model.message.GiftMessage
            if (r0 == 0) goto L1c
            int r0 = r6.LJIIJJI
            int r0 = r0 + 1
            r6.LJIIJJI = r0
            goto L10
        L1c:
            boolean r0 = r7 instanceof com.bytedance.android.livesdk.model.message.SocialMessage
            if (r0 == 0) goto L44
            r0 = r7
            com.bytedance.android.livesdk.model.message.SocialMessage r0 = (com.bytedance.android.livesdk.model.message.SocialMessage) r0
            long r3 = r0.action
            r1 = 3
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L32
            int r0 = r6.LJIIL
            int r0 = r0 + 1
            r6.LJIIL = r0
            goto L10
        L32:
            r0 = r7
            com.bytedance.android.livesdk.model.message.SocialMessage r0 = (com.bytedance.android.livesdk.model.message.SocialMessage) r0
            long r3 = r0.action
            r1 = 1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L44
            int r0 = r6.LJIILIIL
            int r0 = r0 + 1
            r6.LJIILIIL = r0
            goto L10
        L44:
            boolean r1 = r7 instanceof com.bytedance.android.livesdk.model.message.ChatMessage
            if (r1 != 0) goto L54
            boolean r0 = r7 instanceof com.bytedance.android.livesdk.model.message.EmoteChatMessage
            if (r0 != 0) goto L50
            boolean r0 = r7 instanceof com.bytedance.android.livesdk.model.message.LiveIntroMessage
            if (r0 == 0) goto L76
        L50:
            boolean r0 = r7 instanceof com.bytedance.android.livesdk.model.message.EmoteChatMessage
            if (r0 == 0) goto L6b
        L54:
            int r0 = r6.LJIILJJIL
            int r0 = r0 + 1
            r6.LJIILJJIL = r0
            if (r1 == 0) goto L6b
            r0 = r7
            com.bytedance.android.livesdk.model.message.ChatMessage r0 = (com.bytedance.android.livesdk.model.message.ChatMessage) r0
            boolean r0 = r0.LIZ()
            if (r0 == 0) goto L6b
            int r0 = r6.LJIILLIIL
            int r0 = r0 + 1
            r6.LJIILLIIL = r0
        L6b:
            boolean r0 = r7 instanceof com.bytedance.android.livesdk.model.message.EmoteChatMessage
            if (r0 == 0) goto L10
            int r0 = r6.LJIILL
            int r0 = r0 + 1
            r6.LJIILL = r0
            goto L10
        L76:
            boolean r0 = r7 instanceof com.bytedance.android.livesdk.model.message.MemberMessage
            if (r0 == 0) goto L10
            com.bytedance.android.livesdk.model.message.MemberMessage r7 = (com.bytedance.android.livesdk.model.message.MemberMessage) r7
            int r0 = r7.action
            if (r0 != r5) goto L10
            int r0 = r6.LJIL
            int r0 = r0 + 1
            r6.LJIL = r0
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC31385CTl.LJJ(X.CR6, X.CQr, boolean, com.bytedance.android.live.base.model.user.User, boolean):void");
    }
}
