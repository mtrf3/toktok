package X;

import android.app.Application;
import android.content.Context;
import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreException;
import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreResult;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import defpackage.b1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6jw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC168846jw<EFFECT_MODEL> extends AbstractC168856jx {
    public final List<EFFECT_MODEL> LIZ = new ArrayList();
    public final InterfaceC84498XEg LIZIZ;

    public abstract void LJI(Effect effect, EFFECT_MODEL effect_model);

    public abstract void LJIIIIZZ();

    public abstract String LJIIIZ(EFFECT_MODEL effect_model);

    public abstract List<EFFECT_MODEL> LJIIJ();

    public AbstractC168846jw() {
        Application application = C60903NvH.LJ;
        o.LJIIIIZZ(application, "getApplication()");
        this.LIZIZ = C84488XDw.LIZ(application, null);
    }

    public InterfaceC84498XEg LJII() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC168706ji
    public final Object LIZLLL(InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        ((ArrayList) this.LIZ).addAll(LJIIJ());
        return Boolean.valueOf(((ArrayList) this.LIZ).isEmpty());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC168856jx
    public final Object LJFF(InterfaceC67352kd<? super List<DraftFileRestoreResult>> interfaceC67352kd) {
        C1AU c1au;
        final XKS xks = new XKS(1, C78555UsJ.LJJII(interfaceC67352kd));
        xks.LJIIL();
        StringBuilder LIZJ = b1.LIZJ("DraftBaseEffectRestoreHandler", " ; fileType : ");
        LIZJ.append(LIZ());
        LIZJ.append(" ; restore start ...");
        C5Z2.LIZ(X1D.LIZIZ(LIZJ));
        Context context = (Context) getParams().LIZ;
        if ((context instanceof ActivityC45651qj) && (c1au = (C1AU) context) != null) {
            LJII().G8(c1au);
        }
        InterfaceC84498XEg LJII = LJII();
        List<EFFECT_MODEL> list = this.LIZ;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            arrayList.add(LJIIIZ(it.next()));
        }
        LJII.LJ(arrayList, true, null, new IFetchEffectListListener() { // from class: X.6jv
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
            public final void onFail(ExceptionResult e) {
                o.LJIIIZ(e, "e");
                if (!xks.isActive()) {
                    return;
                }
                this.LJIIIIZZ();
                StringBuilder LIZ = X1D.LIZ();
                this.getClass();
                LIZ.append("DraftBaseEffectRestoreHandler");
                LIZ.append(" ; fileType : ");
                LIZ.append(this.LIZ());
                LIZ.append(" ; restore failed ... ; e : ");
                LIZ.append(android.util.Log.getStackTraceString(e.getException()));
                C5Z2.LIZ(X1D.LIZIZ(LIZ));
                XJL<List<DraftFileRestoreResult>> xjl = xks;
                ArrayList LJII2 = C47261Igj.LJII(C168716jj.LIZIZ(this, Integer.valueOf(R.string.eyo), new DraftFileRestoreException(e.getErrorCode() - 30000, e.getException()), 2));
                C3C5.m7constructorimpl(LJII2);
                xjl.resumeWith(LJII2);
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(List<Effect> list2) {
                List<Effect> response = list2;
                o.LJIIIZ(response, "response");
                if (!xks.isActive()) {
                    return;
                }
                StringBuilder LIZ = X1D.LIZ();
                this.getClass();
                LIZ.append("DraftBaseEffectRestoreHandler");
                LIZ.append(" ; fileType : ");
                LIZ.append(this.LIZ());
                LIZ.append(" ; restore success ...");
                C5Z2.LIZ(X1D.LIZIZ(LIZ));
                AbstractC168846jw<Object> abstractC168846jw = this;
                Iterator it2 = ((ArrayList) abstractC168846jw.LIZ).iterator();
                while (true) {
                    Effect effect = null;
                    if (it2.hasNext()) {
                        Object next = it2.next();
                        Iterator<Effect> it3 = response.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                break;
                            }
                            Effect next2 = it3.next();
                            if (o.LJ(next2.getEffectId(), abstractC168846jw.LJIIIZ(next))) {
                                effect = next2;
                                break;
                            }
                        }
                        Effect effect2 = effect;
                        if (effect2 != null) {
                            abstractC168846jw.LJI(effect2, next);
                        }
                    } else {
                        XJL<List<DraftFileRestoreResult>> xjl = xks;
                        ArrayList LJII2 = C47261Igj.LJII(C168716jj.LIZIZ(this, null, null, 7));
                        C3C5.m7constructorimpl(LJII2);
                        xjl.resumeWith(LJII2);
                        return;
                    }
                }
            }
        });
        xks.LJIILIIL(new AqS168S0100000_2(this, (AbstractC168846jw<Object>) 492));
        return xks.LJIIJJI();
    }
}
