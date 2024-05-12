package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.6rH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C173396rH extends AbstractC029409q<RecyclerView.ViewHolder> implements InterfaceC173506rS {
    public final AbstractC42651GoZ LJLIL;
    public final InterfaceC153045zY LJLILLLLZI;
    public final VideoPublishEditModel LJLJI;
    public final AudioEffectParam LJLJJI;
    public final InterfaceC143655kP LJLJJL;
    public boolean LJLJJLL;
    public int LJLJL;
    public CategoryPageModel LJLJLJ;
    public List<? extends Effect> LJLJLLL;
    public RecyclerView LJLL;
    public final C173406rI LJLLI;
    public C173416rJ LJLLILLLL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        int i;
        CategoryEffectModel categoryEffects;
        List<Effect> effects;
        CategoryPageModel categoryPageModel = this.LJLJLJ;
        if (categoryPageModel != null && (categoryEffects = categoryPageModel.getCategoryEffects()) != null && (effects = categoryEffects.getEffects()) != null) {
            i = effects.size();
        } else {
            i = 0;
        }
        return i + 1;
    }

    public final void LJZ(int i) {
        boolean z;
        C81232VuO c81232VuO;
        RecyclerView.ViewHolder viewHolder;
        int itemCount = getItemCount();
        int i2 = this.LJLJL;
        if (i2 >= 0 && i2 < itemCount) {
            z = true;
        } else {
            z = false;
        }
        RecyclerView.ViewHolder viewHolder2 = null;
        if (z) {
            RecyclerView recyclerView = this.LJLL;
            if (recyclerView != null) {
                viewHolder = recyclerView.LJJIZ(i2);
            } else {
                viewHolder = null;
            }
            if (viewHolder instanceof C173516rT) {
                C81232VuO c81232VuO2 = ((C173516rT) viewHolder).LJLJJI;
                if (c81232VuO2 != null) {
                    c81232VuO2.LJ(false);
                }
            } else {
                notifyItemChanged(this.LJLJL);
            }
        }
        this.LJLJL = i;
        if (i < getItemCount()) {
            RecyclerView recyclerView2 = this.LJLL;
            if (recyclerView2 != null) {
                viewHolder2 = recyclerView2.LJJIZ(this.LJLJL);
            }
            if ((viewHolder2 instanceof C173516rT) && (c81232VuO = ((C173516rT) viewHolder2).LJLJJI) != null) {
                c81232VuO.LJ(true);
            }
        }
    }

    @Override // X.AbstractC029409q
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.LJLL = recyclerView;
    }

    @Override // X.InterfaceC173506rS
    public final void LIZ(int i, View view) {
        o.LJIIIZ(view, "view");
        C173406rI c173406rI = this.LJLLI;
        if (c173406rI != null) {
            c173406rI.LIZ(i, view);
        }
    }

    public final void LJLZ(int i, int i2) {
        RecyclerView.ViewHolder viewHolder;
        if (i >= 0 && i < getItemCount()) {
            RecyclerView recyclerView = this.LJLL;
            if (recyclerView != null) {
                viewHolder = recyclerView.LJJIZ(i);
            } else {
                viewHolder = null;
            }
            if (viewHolder instanceof C173516rT) {
                ((C173516rT) viewHolder).M(i2);
            } else {
                notifyItemChanged(i);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ec, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L70;
     */
    @Override // X.AbstractC029409q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r8, int r9) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C173396rH.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        o.LJIIIZ(viewGroup, "viewGroup");
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(viewGroup.getContext()), R.layout.jh, viewGroup, false);
        o.LJII(LLLLIILL, "null cannot be cast to non-null type android.widget.FrameLayout");
        C173516rT c173516rT = new C173516rT((FrameLayout) LLLLIILL, this);
        C0AX.LIZ(viewGroup, c173516rT.itemView, R.id.lj7);
        View view = c173516rT.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c173516rT.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C173516rT.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c173516rT.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c173516rT.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C173516rT.class.getName();
        return c173516rT;
    }

    public final void LJLLLLLL(Effect effect, String str, String str2, String str3) {
        String str4 = str2;
        if (this.LJLILLLLZI != null && str3 != null && str3.length() > 0) {
            if (str4 == null) {
                str4 = "";
            }
            int duration = this.LJLILLLLZI.getDuration();
            C166696gT.LIZ().getClass();
            final AudioEffectParam audioEffectParam = new AudioEffectParam(str, 0, 0, str3, str4, 0, duration, ((C43523H6h) C169416kr.LJ.getValue()).LIZ.LIZIZ(str3), null, null, 512, null);
            audioEffectParam.setShowErrorToast(true);
            this.LJLJJL.MK(C135285Sq.LIZ(true, audioEffectParam));
            C149905uU.LIZLLL(this.LJLJI);
            new C41386GMc(this.LJLIL, ID0.LIZ(effect)).LIZ(new BOC() { // from class: X.6rG
                @Override // X.BOC
                public final void LIZ(AVChallenge aVChallenge) {
                    AudioEffectParam.this.setChallenge(aVChallenge);
                }
            });
        }
    }

    public C173396rH(AbstractC42651GoZ abstractC42651GoZ, InterfaceC153045zY interfaceC153045zY, VideoPublishEditModel videoPublishEditModel, AudioEffectParam audioEffectParam, InterfaceC143655kP editPreviewApi) {
        o.LJIIIZ(editPreviewApi, "editPreviewApi");
        this.LJLIL = abstractC42651GoZ;
        this.LJLILLLLZI = interfaceC153045zY;
        this.LJLJI = videoPublishEditModel;
        this.LJLJJI = audioEffectParam;
        this.LJLJJL = editPreviewApi;
        this.LJLLI = new C173406rI(this);
    }
}
