package X;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.keva.Keva;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.feed.common.newarch.ability.FeedCollectionViewPagerAbility;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.jvm.internal.AqS107S0300000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS58S1200000_3;
import org.json.JSONObject;

/* renamed from: X.8Rt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C211498Rt {
    public static final C5H3<Keva> LJIIIIZZ = C221118m3.LIZ(C211558Rz.LJLIL);
    public final String LIZ;
    public final ConstraintLayout LIZIZ;
    public final InterfaceC65784Pro<FeedCollectionViewPagerAbility> LIZJ;
    public XKQ LIZLLL;
    public final C64962gm LJ = C48841JEv.LIZ(EXV.LIZ);
    public final LinkedBlockingQueue<C211548Ry> LJFF = new LinkedBlockingQueue<>();
    public String LJI;
    public boolean LJII;

    public final void LIZLLL() {
        FeedCollectionViewPagerAbility invoke;
        Aweme item;
        if (this.LJI == null) {
            C221018lt.LJFF("StoryGestureEducation", "unnecessary resume, skip");
        }
        if (this.LIZIZ != null) {
            if (!LJIIIIZZ.getValue().getBoolean("private_like_tip_shown", false)) {
                FeedCollectionViewPagerAbility invoke2 = this.LIZJ.invoke();
                if (invoke2 == null) {
                    item = null;
                } else {
                    item = invoke2.getItem(invoke2.LLILL());
                }
                if (!C78996UzQ.LJJIIZI(item)) {
                    this.LJFF.offer(new C211548Ry(new C211508Ru(this, null)));
                }
            }
            if (C210518Nz.LIZ() && (invoke = this.LIZJ.invoke()) != null && invoke.LLILL() + 1 != invoke.LJJLIIIJJIZ().getCount()) {
                this.LJFF.offer(new C211548Ry(new C211518Rv(this, null)));
            }
        }
        this.LIZLLL = XKX.LIZLLL(this.LJ, null, null, new C211458Rp(this, null), 3);
    }

    public final JSONObject LIZ(InterfaceC88472Yns<? super JSONObject, C76800UCe> interfaceC88472Yns) {
        Aweme item;
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.LIZ;
            if (str == null) {
                str = "";
            }
            jSONObject.put("enter_from", str);
            FeedCollectionViewPagerAbility invoke = this.LIZJ.invoke();
            if (invoke != null) {
                item = invoke.getItem(invoke.LLILL());
            } else {
                item = null;
            }
            if (item != null) {
                jSONObject.put("group_id", item.getGroupId());
                jSONObject.put("author_id", item.getAuthorUid());
                jSONObject.put("follow_status", C44729Hgz.LJIIZILJ(item.getAuthor()));
                interfaceC88472Yns.invoke(jSONObject);
            }
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC67352kd<? super X.C76800UCe> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C211488Rs
            if (r0 == 0) goto L7d
            r3 = r8
            X.8Rs r3 = (X.C211488Rs) r3
            int r2 = r3.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7d
            int r2 = r2 - r1
            r3.LJLJJI = r2
        L12:
            java.lang.Object r1 = r3.LJLILLLLZI
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r3.LJLJJI
            r2 = 1
            if (r0 == 0) goto L5f
            if (r0 != r2) goto L83
            X.8Rt r6 = r3.LJLIL
            X.C141335gf.LIZJ(r1)
        L22:
            java.util.concurrent.LinkedBlockingQueue<X.8Ry> r0 = r6.LJFF
            java.lang.Object r5 = r0.poll()
            X.8Ry r5 = (X.C211548Ry) r5
            if (r5 != 0) goto L32
            r6.LIZJ(r2)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L32:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "running task, "
            r1.append(r0)
            java.util.concurrent.LinkedBlockingQueue<X.8Ry> r0 = r6.LJFF
            int r0 = r0.size()
            r1.append(r0)
            java.lang.String r0 = " task(s) remain"
            r1.append(r0)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = "StoryGestureEducation"
            X.C221018lt.LJFF(r0, r1)
            X.Yns<X.2kd<? super X.UCe>, java.lang.Object> r0 = r5.LIZ
            r3.LJLIL = r6
            r3.LJLJJI = r2
            java.lang.Object r0 = r0.invoke(r3)
            if (r0 != r4) goto L22
            return r4
        L5f:
            X.C141335gf.LIZJ(r1)
            java.util.concurrent.LinkedBlockingQueue<X.8Ry> r0 = r7.LJFF
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto L71
            r7.LIZJ(r1)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L71:
            X.2IP r0 = new X.2IP
            r0.<init>(r2, r1)
            X.C2U8.LIZ(r0)
            r7.LJII = r2
            r6 = r7
            goto L22
        L7d:
            X.8Rs r3 = new X.8Rs
            r3.<init>(r7, r8)
            goto L12
        L83:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C211498Rt.LIZIZ(X.2kd):java.lang.Object");
    }

    public final void LIZJ(boolean z) {
        if (this.LJII && z) {
            C2U8.LIZ(new C2IP(false, false));
            this.LJII = false;
        }
        this.LIZLLL = null;
        PopupManager.LIZJ(C8S0.class);
        PopupManager.LIZJ(C8S1.class);
    }

    public C211498Rt(String str, ConstraintLayout constraintLayout, AqS153S0100000_3 aqS153S0100000_3) {
        this.LIZ = str;
        this.LIZIZ = constraintLayout;
        this.LIZJ = aqS153S0100000_3;
    }

    public final Object LJ(AbstractC211528Rw abstractC211528Rw, String str, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(interfaceC67352kd));
        abstractC211528Rw.LJLJI = new AqS107S0300000_3(abstractC211528Rw, this, c84654XKg, 29);
        abstractC211528Rw.LJLJJI = new AqS58S1200000_3(this, abstractC211528Rw, str, 14);
        PopupManager.LJIIL(abstractC211528Rw);
        Object LIZ = c84654XKg.LIZ();
        if (LIZ == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LIZ;
        }
        return C76800UCe.LIZ;
    }
}
