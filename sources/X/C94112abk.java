package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.bytedance.effectcreatormobile.ckeapi.api.objectselect.IObjectSelect;
import com.bytedance.effectcreatormobile.objectselect.impl.ObjectSelectLiveData;
import com.bytedance.ugc.effectcreator.main.MainFragment;
import com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext;
import kotlin.jvm.internal.o;

/* renamed from: X.abk, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94112abk implements Observer<AbstractC93937aYv> {
    public final /* synthetic */ MainFragment LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(AbstractC93937aYv abstractC93937aYv) {
        AbstractC93937aYv t = abstractC93937aYv;
        o.LJIIIZ(t, "t");
        if (C93939aYx.LIZIZ(t)) {
            CKEffectEditorContext.LJIIJJI();
            MainFragment mainFragment = this.LJLIL;
            String str = this.LJLILLLLZI;
            String str2 = this.LJLJI;
            String str3 = this.LJLJJI;
            LifecycleOwner viewLifecycleOwner = mainFragment.getViewLifecycleOwner();
            o.LJIIIIZZ(viewLifecycleOwner, "viewLifecycleOwner");
            LiveData<EnumC93488aRg> liveData = null;
            XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C94908aoa(mainFragment, str2, str, str3, null), 3);
            this.LJLIL.getChildFragmentManager().LJJLIIIJJIZ(1, null);
            Fragment LJJJIL = this.LJLIL.getChildFragmentManager().LJJJIL(C93819aX1.LIZ().getTag());
            if (LJJJIL != null) {
                FragmentManager childFragmentManager = this.LJLIL.getChildFragmentManager();
                childFragmentManager.getClass();
                C1B3 c1b3 = new C1B3(childFragmentManager);
                c1b3.LJJI(LJJJIL);
                c1b3.LJIILLIIL();
                IObjectSelect LIZIZ = C93819aX1.LIZIZ();
                if (LIZIZ != null) {
                    liveData = LIZIZ.getPanelStateLiveData();
                }
                if ((liveData instanceof ObjectSelectLiveData) && liveData != null) {
                    liveData.setValue(EnumC93488aRg.DISMISS);
                }
            }
            C93939aYx.LIZ().getRenderModeData().removeObserver(this);
        }
    }

    public C94112abk(MainFragment mainFragment, String str, String str2, String str3) {
        this.LJLIL = mainFragment;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = str3;
    }
}
