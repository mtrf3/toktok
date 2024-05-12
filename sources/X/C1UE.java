package X;

import Y.ARunnableS39S0100000_3;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryCurrentInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.1UE, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1UE implements InterfaceC63132Oq8 {
    public Object LIZ;

    @Override // X.InterfaceC63132Oq8
    public final void close() {
        ((InterfaceC79378VDi) this.LIZ).close();
    }

    @Override // X.InterfaceC63132Oq8
    public final int getCount() {
        return ((InterfaceC79378VDi) this.LIZ).getCount();
    }

    @Override // X.InterfaceC63132Oq8
    public final boolean moveToFirst() {
        return ((InterfaceC79378VDi) this.LIZ).moveToFirst();
    }

    @Override // X.InterfaceC63132Oq8
    public final boolean moveToNext() {
        return ((InterfaceC79378VDi) this.LIZ).moveToNext();
    }

    public C1UE(int i) {
        if (i != 3) {
            this.LIZ = new MutableLiveData();
        }
    }

    public static boolean LIZIZ(Aweme aweme) {
        UserStory userStory;
        Long valueOf;
        UserStory userStory2;
        UserStoryCurrentInfo currentInfo;
        Integer currentIndex;
        if (aweme == null || !C54838Lfe.LJJ(aweme)) {
            return false;
        }
        C53578L1a.LIZ.getClass();
        if (!C53578L1a.LIZ() || C2304092m.LIZ() || C220828la.LIZ().getBoolean("key_swipe_guide_shown", false) || C220828la.LIZ().getBoolean("key_has_performed_swipe", false)) {
            return false;
        }
        long j = C220828la.LIZ().getLong("key_first_use_time_new_version", 0L);
        if (j <= 0 || C57105Mb7.LJII(Long.valueOf(j)) <= 7 || (userStory = aweme.getUserStory()) == null || (valueOf = Long.valueOf(userStory.getTotalCount())) == null || valueOf.longValue() <= 1 || (userStory2 = aweme.getUserStory()) == null || (currentInfo = userStory2.getCurrentInfo()) == null || (currentIndex = currentInfo.getCurrentIndex()) == null || currentIndex.intValue() != 0 || C78996UzQ.LJJIIZI(aweme)) {
            return false;
        }
        return true;
    }

    public final void LIZ(InterfaceC15200ii repoProxy) {
        o.LJIIIZ(repoProxy, "repoProxy");
        this.LIZ = repoProxy.LIZ((InterfaceC32651Px) this.LIZ);
    }

    public final void LIZJ(ViewGroup viewGroup) {
        if (this.LIZ == null) {
            return;
        }
        viewGroup.addView((View) this.LIZ, new FrameLayout.LayoutParams(-1, -1));
        View view = (View) this.LIZ;
        if (view != null) {
            view.setVisibility(0);
        }
        View view2 = (View) this.LIZ;
        if (view2 != null) {
            view2.setAlpha(0.0f);
        }
        C220808lY c220808lY = (C220808lY) this.LIZ;
        if (c220808lY != null) {
            c220808lY.getSwipeLottieAnim().setAnimation("finger_swipe_right_guide.json");
            C2U8.LIZ(new C2IP(true, false));
            c220808lY.animate().alpha(1.0f).setDuration(250L).withEndAction(new ARunnableS39S0100000_3(c220808lY, 229)).start();
            c220808lY.LIZIZ("", true);
        }
    }

    @Override // X.InterfaceC63132Oq8
    public final byte[] getBlob(int i) {
        return ((InterfaceC79378VDi) this.LIZ).getBlob(i);
    }

    @Override // X.InterfaceC63132Oq8
    public final int getColumnIndex(String str) {
        return ((InterfaceC79378VDi) this.LIZ).getColumnIndex(str);
    }

    @Override // X.InterfaceC63132Oq8
    public final int getInt(int i) {
        return ((InterfaceC79378VDi) this.LIZ).getInt(i);
    }

    @Override // X.InterfaceC63132Oq8
    public final long getLong(int i) {
        return ((InterfaceC79378VDi) this.LIZ).getLong(i);
    }

    @Override // X.InterfaceC63132Oq8
    public final String getString(int i) {
        return ((InterfaceC79378VDi) this.LIZ).getString(i);
    }

    public /* synthetic */ C1UE(InterfaceC32651Px delegate) {
        o.LJIIIZ(delegate, "delegate");
        this.LIZ = delegate;
    }
}
