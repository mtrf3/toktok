package X;

import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.group.UserVisibleHintGroupScene;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.image.model.ImageAlbumData;
import com.ss.android.ugc.aweme.image.model.ImageStickerInfo;
import com.ss.android.ugc.aweme.image.model.SingleImageData;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.5tB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C149095tB extends PagerAdapter {
    public final WMH LJLILLLLZI;
    public UserVisibleHintGroupScene LJLJI;
    public final CreativeInfo LJLJJI;
    public final ImageAlbumData LJLJJL;
    public final InterfaceC151165wW LJLJJLL;
    public final InterfaceC65784Pro<C76800UCe> LJLJL;
    public final C82622Wbi LJLJLJ;
    public final List<StickerItemModel> LJLJLLL;
    public List<SingleImageData> LJLL;
    public List<Integer> LJLLI;
    public final java.util.Map<Integer, WMH> LJLLILLLL;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LJLL.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int LJIIL(Object obj) {
        C151055wL c151055wL;
        o.LJIIIZ(obj, "obj");
        List<Integer> list = this.LJLLI;
        Integer num = null;
        if ((obj instanceof C151055wL) && (c151055wL = (C151055wL) obj) != null) {
            num = Integer.valueOf(c151055wL.LLIIIJ);
        }
        if (ORZ.LJLJJI(num, list)) {
            return -2;
        }
        return -1;
    }

    public final void LJJIII(boolean z) {
        int i;
        for (WMH wmh : ((LinkedHashMap) this.LJLLILLLL).values()) {
            o.LJII(wmh, "null cannot be cast to non-null type com.ss.android.ugc.aweme.image.preview.ImageEditItemScene");
            C151055wL c151055wL = (C151055wL) wmh;
            if (c151055wL.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
                SurfaceView LLJJIII = c151055wL.LLJJIII();
                if (z) {
                    i = 0;
                } else {
                    i = 8;
                }
                LLJJIII.setVisibility(i);
            }
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJIILLIIL(int i, ViewGroup viewGroup) {
        int id = viewGroup.getId();
        if (id != -1) {
            String LIZ = C61845OOz.LIZ("android:switcher:", i);
            C152175y9 c152175y9 = (C152175y9) viewGroup;
            UserVisibleHintGroupScene userVisibleHintGroupScene = (UserVisibleHintGroupScene) this.LJLILLLLZI.findSceneByTag(LIZ);
            if (userVisibleHintGroupScene != null) {
                LJJIIJ(c152175y9, userVisibleHintGroupScene, i);
                this.LJLILLLLZI.show(userVisibleHintGroupScene);
                return userVisibleHintGroupScene;
            }
            List<SingleImageData> list = this.LJLL;
            C151055wL c151055wL = new C151055wL((SingleImageData) ListProtector.get(list, i % list.size()), this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJJI, this.LJLJLJ);
            c151055wL.LLIIIJ = i;
            this.LJLLILLLL.put(Integer.valueOf(i), c151055wL);
            LJJIIJ(c152175y9, c151055wL, i);
            this.LJLILLLLZI.add(id, c151055wL, LIZ);
            return c151055wL;
        }
        throw new IllegalArgumentException("ViewPager should have view id before use ScenePageAdapter");
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean LJIIZILJ(View view, Object obj) {
        if (((WM7) obj).mView == view) {
            return true;
        }
        return false;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIIZ(int i, ViewGroup container, Object object) {
        o.LJIIIZ(container, "container");
        o.LJIIIZ(object, "object");
        this.LJLILLLLZI.remove((WM7) object);
        this.LJLLILLLL.remove(Integer.valueOf(i));
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIL(int i, ViewGroup viewGroup, Object obj) {
        UserVisibleHintGroupScene userVisibleHintGroupScene = (UserVisibleHintGroupScene) obj;
        UserVisibleHintGroupScene userVisibleHintGroupScene2 = this.LJLJI;
        if (userVisibleHintGroupScene != userVisibleHintGroupScene2) {
            if (userVisibleHintGroupScene2 != null) {
                userVisibleHintGroupScene2.setUserVisibleHint(false);
            }
            if (userVisibleHintGroupScene != null) {
                userVisibleHintGroupScene.setUserVisibleHint(true);
            }
            this.LJLJI = userVisibleHintGroupScene;
        }
    }

    public final void LJJIIJ(C152175y9 c152175y9, UserVisibleHintGroupScene userVisibleHintGroupScene, int i) {
        if (this.LJLJI == null && c152175y9.getCurrentItem() == i) {
            this.LJLJI = userVisibleHintGroupScene;
        }
        if (userVisibleHintGroupScene == this.LJLJI) {
            if (userVisibleHintGroupScene.mUserVisibleHint) {
                userVisibleHintGroupScene.setUserVisibleHint(false);
            }
            userVisibleHintGroupScene.setUserVisibleHint(true);
        } else {
            if (!userVisibleHintGroupScene.mUserVisibleHint) {
                return;
            }
            userVisibleHintGroupScene.setUserVisibleHint(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C149095tB(CreativeInfo creativeInfo, ImageAlbumData imageData, WMH parentScene, InterfaceC151165wW interfaceC151165wW, InterfaceC65784Pro<C76800UCe> onImageClickListener, C82622Wbi diContainer, List<? extends StickerItemModel> initSticker) {
        o.LJIIIZ(imageData, "imageData");
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(onImageClickListener, "onImageClickListener");
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(initSticker, "initSticker");
        this.LJLILLLLZI = parentScene;
        this.LJLJJI = creativeInfo;
        this.LJLJJL = imageData;
        this.LJLJJLL = interfaceC151165wW;
        this.LJLJL = onImageClickListener;
        this.LJLJLJ = diContainer;
        this.LJLJLLL = initSticker;
        List<SingleImageData> imageList = imageData.getImageList();
        for (SingleImageData singleImageData : imageList) {
            List LLJILJILJ = ORZ.LLJILJILJ(singleImageData.getStickerInfo().getStickers());
            ((ArrayList) LLJILJILJ).addAll(this.LJLJLLL);
            singleImageData.setStickerInfo(new ImageStickerInfo(LLJILJILJ));
        }
        this.LJLL = imageList;
        this.LJLLI = C61878OQg.INSTANCE;
        this.LJLLILLLL = new LinkedHashMap();
    }
}
