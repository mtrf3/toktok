package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.setting.ui.SettingNewVersionFragment;

/* renamed from: X.Sdp, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C72561Sdp implements ViewModelProvider.Factory {
    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, C0VK c0vk) {
        return C09L.LIZIZ(this, cls, c0vk);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> cls) {
        try {
            T newInstance = cls.newInstance();
            if (newInstance instanceof JediViewModel) {
                JediViewModel jediViewModel = (JediViewModel) newInstance;
                InterfaceC72022SOk create = jediViewModel.LJLJJI.create(cls);
                if (create != null) {
                    create.binding(jediViewModel);
                }
                final int i = 0;
                jediViewModel.ov0(new InterfaceC88472Yns() { // from class: X.Sdq
                    @Override // X.InterfaceC88472Yns
                    public final Object invoke(Object obj) {
                        switch (i) {
                            case 0:
                                return obj;
                            default:
                                return SettingNewVersionFragment.lambda$initUnits$14((C2068389v) obj);
                        }
                    }
                });
            }
            return newInstance;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(C09K.LIZIZ("Cannot create an instance of ", cls), e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(C09K.LIZIZ("Cannot create an instance of ", cls), e2);
        }
    }
}
