package X;

import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect2;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ERD extends ERM {
    public final ShortVideoContext LJLIL;
    public final InterfaceC84497XEf LJLILLLLZI;
    public final List<ERO> LJLJI;
    public final LifecycleOwner LJLJJI;
    public final I3X LJLJJL;
    public final LifecycleCoroutineScope LJLJJLL;
    public final List<InterfaceC79150V4o> LJLJL;
    public final java.util.Map<String, ERE> LJLJLJ;
    public String LJLJLLL;
    public Effect LJLL;
    public ERB LJLLI;
    public UploadableMobileEffect2 LJLLILLLL;
    public FaceStickerBean LJLLJ;

    public final void LIZIZ() {
        Iterator it = ((ArrayList) this.LJLJL).iterator();
        while (it.hasNext()) {
            InterfaceC79150V4o interfaceC79150V4o = (InterfaceC79150V4o) it.next();
            if (interfaceC79150V4o.isActive()) {
                interfaceC79150V4o.LIZIZ(C62848OlY.LIZ("effect unselected", null));
            }
        }
        ((ArrayList) this.LJLJL).clear();
        this.LJLL = null;
        this.LJLLILLLL = null;
        this.LJLLI = null;
        this.LJLLJ = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(X.InterfaceC67352kd<? super X.C76800UCe> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.EGM
            if (r0 == 0) goto L50
            r4 = r6
            X.EGM r4 = (X.EGM) r4
            int r2 = r4.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L50
            int r2 = r2 - r1
            r4.LJLJJI = r2
        L12:
            java.lang.Object r3 = r4.LJLILLLLZI
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJJI
            r1 = 1
            if (r0 == 0) goto L37
            if (r0 != r1) goto L5b
            X.ERD r0 = r4.LJLIL
            X.C141335gf.LIZJ(r3)
        L22:
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L56
            java.lang.String r1 = "MET-JEFF"
            java.lang.String r0 = "Cannot export, failed to generate effectId"
            X.H78.LIZIZ(r1, r0)
            X.HEe r0 = X.C60903NvH.LJIIJJI()
            r0.LJIJJLI()
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L37:
            X.C141335gf.LIZJ(r3)
            java.lang.String r0 = r5.LJLJLLL
            if (r0 == 0) goto L41
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L41:
            X.XEf r0 = r5.LJLILLLLZI
            r4.LJLIL = r5
            r4.LJLJJI = r1
            java.lang.Object r3 = X.ET5.LIZ(r0, r4)
            if (r3 != r2) goto L4e
            return r2
        L4e:
            r0 = r5
            goto L22
        L50:
            X.EGM r4 = new X.EGM
            r4.<init>(r5, r6)
            goto L12
        L56:
            r0.LJLJLLL = r3
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L5b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ERD.LJ(X.2kd):java.lang.Object");
    }

    public final void LIZJ(Effect effect, UploadableMobileEffect2 uploadableMobileEffect2, ERB erb, boolean z) {
        ERE ere = (ERE) ((LinkedHashMap) this.LJLJLJ).get(uploadableMobileEffect2.effectId);
        if (ere != null && ere.LIZLLL == 0 && ere.LJ.invoke().booleanValue()) {
            this.LJLIL.creativeModel.mobileEffectsModel2.exportedEffects.add(uploadableMobileEffect2);
            if (z) {
                this.LJLJJL.UF(false);
            } else {
                this.LJLJJL.UF(true);
            }
            ((ArrayList) this.LJLJL).add(XKX.LIZLLL(C780334l.LJLIL, EXV.LIZ, null, new ERC(ere, this, uploadableMobileEffect2, z, erb, effect, null), 2));
            return;
        }
        H78.LIZIZ("MET-JEFF", "effect export skipped");
    }

    @Override // X.InterfaceC81397Vx3
    public final void onMessageReceived(int i, int i2, int i3, String str) {
        ERB erb = this.LJLLI;
        if (erb != null) {
            erb.onMessageReceived(i, i2, i3, str);
        }
    }

    public ERD(C29S activity, ShortVideoContext shortVideoContext, InterfaceC84497XEf effectPlatform, List list, C46193IAz lifecycleOwner, I3X recordControlApi) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        o.LJIIIZ(effectPlatform, "effectPlatform");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(recordControlApi, "recordControlApi");
        this.LJLIL = shortVideoContext;
        this.LJLILLLLZI = effectPlatform;
        this.LJLJI = list;
        this.LJLJJI = lifecycleOwner;
        this.LJLJJL = recordControlApi;
        this.LJLJJLL = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner);
        this.LJLJL = new ArrayList();
        this.LJLJLJ = new LinkedHashMap();
    }
}
