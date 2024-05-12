package X;

import android.view.View;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public abstract class MVY extends C56906MVa {
    public AP9 avatar;
    public final C5H3 avatarEntry$delegate;
    public EnumC56954MWw scene;
    public final C5H3 socPubAvatarFrameLayout$delegate;

    public abstract User getUserFromNotice();

    public boolean isFromAggregatedAvatar() {
        return false;
    }

    private final InterfaceC100393wp getAvatarEntry() {
        return (InterfaceC100393wp) this.avatarEntry$delegate.getValue();
    }

    public final C53691L5j getSocPubAvatarFrameLayout() {
        Object value = this.socPubAvatarFrameLayout$delegate.getValue();
        o.LJIIIIZZ(value, "<get-socPubAvatarFrameLayout>(...)");
        return (C53691L5j) value;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MVY(View itemView) {
        super(itemView);
        o.LJIIIZ(itemView, "itemView");
        this.socPubAvatarFrameLayout$delegate = C221108m2.LIZIZ(new AqS159S0100000_9(itemView, 447));
        this.avatarEntry$delegate = C221108m2.LIZIZ(new AqS159S0100000_9(this, 446));
    }

    @Override // X.MVV
    public void applyNewStyle(C96533qb c96533qb) {
        super.applyNewStyle(c96533qb);
        applyHeadStoryRing(c96533qb, getSocPubAvatarFrameLayout());
    }

    public final void checkAndGetStory(boolean z) {
        User user;
        if (z) {
            user = getUserFromNotice();
        } else {
            user = null;
        }
        if (!isFromAggregatedAvatar()) {
            InterfaceC100393wp avatarEntry = getAvatarEntry();
            if (avatarEntry != null) {
                avatarEntry.LJI(user);
                return;
            }
            return;
        }
        InterfaceC100393wp avatarEntry2 = getAvatarEntry();
        if (avatarEntry2 == null) {
            return;
        }
        avatarEntry2.LJI(null);
    }

    public final void setLogScene(EnumC56954MWw scene) {
        o.LJIIIZ(scene, "scene");
        this.scene = scene;
    }

    @Override // X.MVV
    public void addTypeIconToAvatar(AP9 ap9, UrlModel urlModel, boolean z) {
        if (getSocPubAvatarFrameLayout().getMode() != EnumC53695L5n.NONE) {
            return;
        }
        this.avatar = ap9;
        super.addTypeIconToAvatar(ap9, urlModel, z);
    }

    public static /* synthetic */ void checkAndGetStory$default(MVY mvy, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = true;
            }
            mvy.checkAndGetStory(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkAndGetStory");
    }
}
