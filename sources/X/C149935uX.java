package X;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.commerce.tools.music.CommerceToolsMusicService;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.editorpro.bottom.panel.VoiceEffectPanelFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.5uX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C149935uX extends AbstractC65781Prl implements InterfaceC88474Ynu<List<? extends Effect>, Boolean, Integer, String, C76800UCe> {
    public final /* synthetic */ VoiceEffectPanelFragment LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ C150145us LJLJI;
    public final /* synthetic */ Effect LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C149935uX(VoiceEffectPanelFragment voiceEffectPanelFragment, boolean z, C150145us c150145us, Effect effect) {
        super(4);
        this.LJLIL = voiceEffectPanelFragment;
        this.LJLILLLLZI = z;
        this.LJLJI = c150145us;
        this.LJLJJI = effect;
    }

    @Override // X.InterfaceC88474Ynu
    public final C76800UCe invoke(List<? extends Effect> list, Boolean bool, Integer num, String str) {
        View _$_findCachedViewById;
        boolean z;
        ActivityC45651qj mo49getActivity;
        String string;
        List<? extends Effect> list2 = list;
        bool.booleanValue();
        VoiceEffectPanelFragment voiceEffectPanelFragment = this.LJLIL;
        voiceEffectPanelFragment.LLF = false;
        if (voiceEffectPanelFragment.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
            ((C149945uY) this.LJLIL._$_findCachedViewById(R.id.n2x)).LIZIZ();
            if (num != null) {
                if (this.LJLILLLLZI && (mo49getActivity = this.LJLIL.mo49getActivity()) != null) {
                    View _$_findCachedViewById2 = this.LJLIL._$_findCachedViewById(R.id.n2x);
                    _$_findCachedViewById2.getClass();
                    boolean isFakeNetwork = C163626bW.LIZ().isFakeNetwork();
                    boolean isWeakNetwork = C163626bW.LIZ().isWeakNetwork();
                    boolean LIZJ = C48203Ivv.LIZJ(mo49getActivity);
                    if (isFakeNetwork) {
                        string = _$_findCachedViewById2.getContext().getString(R.string.sjl);
                    } else if (isWeakNetwork) {
                        string = _$_findCachedViewById2.getContext().getString(R.string.sjj);
                    } else if (LIZJ) {
                        string = _$_findCachedViewById2.getContext().getString(R.string.sjh);
                    } else {
                        string = _$_findCachedViewById2.getContext().getString(R.string.sjj);
                    }
                    o.LJIIIIZZ(string, "if (isFakeNet) {\n       …essage_connect)\n        }");
                    CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                    creativeToastBuilder.message(string);
                    C78915Uy7.LJJIIZI(mo49getActivity, 6001, creativeToastBuilder);
                }
                ((C149945uY) this.LJLIL._$_findCachedViewById(R.id.n2x)).LIZLLL();
            }
            ArrayList arrayList = new ArrayList();
            if (list2 != null) {
                VoiceEffectPanelFragment voiceEffectPanelFragment2 = this.LJLIL;
                C150145us c150145us = this.LJLJI;
                for (Effect effect : list2) {
                    if (OUP.LJJIIZ(effect)) {
                        voiceEffectPanelFragment2.getClass();
                        if (!CommerceToolsMusicService.LIZIZ(false).U40() || !OUP.LJJI(effect)) {
                            boolean LJJIIZ = OUP.LJJIIZ(effect);
                            if (!C1DG.LJIIIIZZ() && ((Number) C166656gP.LIZ.getValue()).intValue() == 2) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!LJJIIZ || z) {
                                if (c150145us == null || !c150145us.LIZLLL || !LJJIIZ) {
                                    arrayList.add(effect);
                                }
                            }
                        }
                    }
                }
            }
            if ((!arrayList.isEmpty()) && (_$_findCachedViewById = this.LJLIL._$_findCachedViewById(R.id.a6v)) != null) {
                _$_findCachedViewById.setVisibility(0);
            }
            ((ArrayList) this.LJLIL.LLFZ).clear();
            ((ArrayList) this.LJLIL.LLFZ).addAll(arrayList);
            this.LJLIL.nm().LJII(arrayList, this.LJLJI, this.LJLJJI);
            this.LJLIL.lm();
            this.LJLIL.nm().LJIIJJI();
        }
        return C76800UCe.LIZ;
    }
}
