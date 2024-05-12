package Y;

import X.C09L;
import X.C0VK;
import X.C1036745b;
import X.C78613UtF;
import X.C99033ud;
import X.InterfaceC68472mR;
import X.InterfaceC72342sg;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.common.CommonChatNoticeViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.group.GroupChatNoticeViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.single.SingleChatNoticeViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.suggestedemoji.SuggestedEmojiViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.FakeMessageViewModel;
import com.ss.android.ugc.aweme.kids.profile.MyProfileFragment;
import com.ss.android.ugc.aweme.kids.profile.viewmodel.KidsProfileViewModel;
import com.ss.android.ugc.aweme.tools.draft.ftc.pages.KidsDraftVideoFeedFragment;
import com.ss.android.ugc.aweme.tools.draft.ftc.viewmodel.KidsDraftFeedViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class IDFactoryS408S0100000_1 implements ViewModelProvider.Factory {
    public final int $t;
    public Object l0;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> cls) {
        switch (this.$t) {
            case 0:
                return (T) create$0(this, cls);
            case 1:
                return (T) create$1(this, cls);
            case 2:
                return (T) create$2(this, cls);
            case 3:
                return (T) create$3(this, cls);
            case 4:
                return (T) create$4(this, cls);
            case 5:
                return (T) create$5(this, cls);
            case 6:
                return (T) create$6(this, cls);
            default:
                return null;
        }
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, C0VK c0vk) {
        switch (this.$t) {
            case 0:
                return C09L.LIZIZ(this, cls, c0vk);
            case 1:
                return C09L.LIZIZ(this, cls, c0vk);
            case 2:
                return C09L.LIZIZ(this, cls, c0vk);
            case 3:
                return C09L.LIZIZ(this, cls, c0vk);
            case 4:
                return C09L.LIZIZ(this, cls, c0vk);
            case 5:
                return C09L.LIZIZ(this, cls, c0vk);
            case 6:
                return C09L.LIZIZ(this, cls, c0vk);
            default:
                return null;
        }
    }

    public IDFactoryS408S0100000_1(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final ViewModel create$0(IDFactoryS408S0100000_1 iDFactoryS408S0100000_1, Class modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        return new CommonChatNoticeViewModel((C1036745b) iDFactoryS408S0100000_1.l0, C78613UtF.LIZJ);
    }

    public static final ViewModel create$1(IDFactoryS408S0100000_1 iDFactoryS408S0100000_1, Class modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        return new GroupChatNoticeViewModel((C1036745b) iDFactoryS408S0100000_1.l0);
    }

    public static final ViewModel create$2(IDFactoryS408S0100000_1 iDFactoryS408S0100000_1, Class modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        return new SingleChatNoticeViewModel((C1036745b) iDFactoryS408S0100000_1.l0);
    }

    public static final ViewModel create$3(IDFactoryS408S0100000_1 iDFactoryS408S0100000_1, Class modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        return new SuggestedEmojiViewModel((C1036745b) iDFactoryS408S0100000_1.l0);
    }

    public static final ViewModel create$4(IDFactoryS408S0100000_1 iDFactoryS408S0100000_1, Class modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        if (modelClass.isAssignableFrom(FakeMessageViewModel.class)) {
            return new FakeMessageViewModel((C99033ud) iDFactoryS408S0100000_1.l0);
        }
        throw new IllegalArgumentException("FakeMessageViewModel, Unknown ViewModel class");
    }

    public static final ViewModel create$5(IDFactoryS408S0100000_1 iDFactoryS408S0100000_1, Class modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        return new KidsProfileViewModel((InterfaceC72342sg) ((MyProfileFragment) iDFactoryS408S0100000_1.l0).LJLJJI.getValue());
    }

    public static final ViewModel create$6(IDFactoryS408S0100000_1 iDFactoryS408S0100000_1, Class modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        return new KidsDraftFeedViewModel((InterfaceC68472mR) ((KidsDraftVideoFeedFragment) iDFactoryS408S0100000_1.l0).LJLJL.getValue());
    }
}
