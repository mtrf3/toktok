package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.group.UserVisibleHintGroupScene;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.PreviewImageScene;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.PreviewVideoScene;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Hvb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45635Hvb extends PagerAdapter {
    public final WMH LJLILLLLZI;
    public UserVisibleHintGroupScene LJLJI;
    public final WGT LJLJJI;
    public final boolean LJLJJL;
    public final CreativeInfo LJLJJLL;
    public final java.util.Map<Integer, InterfaceC45640Hvg> LJLJL;
    public List<MyMediaModel> LJLJLJ;

    public final void LJJIIJZLJL() {
        int i = 1;
        for (MyMediaModel myMediaModel : this.LJLJLJ) {
            myMediaModel.selectIndex = i;
            myMediaModel.mediaIndex = i - 1;
            i++;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LJLJLJ.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int LJIIL(Object obj) {
        Object obj2;
        int intValue;
        o.LJIIIZ(obj, "obj");
        if (!((LinkedHashMap) this.LJLJL).containsValue(obj)) {
            return -2;
        }
        Iterator it = ((LinkedHashMap) this.LJLJL).keySet().iterator();
        while (true) {
            if (it.hasNext()) {
                obj2 = it.next();
                if (o.LJ(obj, ((LinkedHashMap) this.LJLJL).get(Integer.valueOf(((Number) obj2).intValue())))) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        Integer num = (Integer) obj2;
        if (num != null && (intValue = num.intValue()) < this.LJLJLJ.size() && ((MediaModel) ListProtector.get(this.LJLJLJ, intValue)).libraryState != null) {
            InterfaceC45640Hvg interfaceC45640Hvg = (InterfaceC45640Hvg) ((LinkedHashMap) this.LJLJL).get(Integer.valueOf(intValue));
            if (interfaceC45640Hvg != null && interfaceC45640Hvg.LJLLI()) {
                return -2;
            }
            return -1;
        }
        return -1;
    }

    public final InterfaceC45640Hvg LJJIIJ(int i) {
        Object obj = ((LinkedHashMap) this.LJLJL).get(Integer.valueOf(i));
        if (obj == null) {
            obj = null;
        }
        return (InterfaceC45640Hvg) obj;
    }

    public final void LJJIIZ(MyMediaModel mediaModel) {
        o.LJIIIZ(mediaModel, "mediaModel");
        int size = this.LJLJLJ.size();
        for (int i = 0; i < size; i++) {
            if (o.LJ(((MediaModel) ListProtector.get(this.LJLJLJ, i)).id, mediaModel.id)) {
                if (i == -1) {
                    return;
                }
                MediaModel mediaModel2 = (MediaModel) ListProtector.get(this.LJLJLJ, i);
                mediaModel2.duration = mediaModel.duration;
                mediaModel2.libraryState = mediaModel.libraryState;
                notifyDataSetChanged();
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.PreviewVideoScene] */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.Hvb] */
    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJIILLIIL(int i, ViewGroup viewGroup) {
        PreviewImageScene previewImageScene;
        UserVisibleHintGroupScene userVisibleHintGroupScene;
        int id = viewGroup.getId();
        if (id != -1) {
            String LIZ = C61845OOz.LIZ("android:switcher:", i);
            ViewPager viewPager = (ViewPager) viewGroup;
            UserVisibleHintGroupScene userVisibleHintGroupScene2 = (UserVisibleHintGroupScene) this.LJLILLLLZI.findSceneByTag(LIZ);
            if (userVisibleHintGroupScene2 != null) {
                LJJIII(viewPager, userVisibleHintGroupScene2, i);
                this.LJLILLLLZI.show(userVisibleHintGroupScene2);
                userVisibleHintGroupScene = userVisibleHintGroupScene2;
            } else {
                MyMediaModel myMediaModel = (MyMediaModel) ORZ.LJLLLLLL(i, this.LJLJLJ);
                if (myMediaModel != null && (myMediaModel.LJI() || myMediaModel.libraryState != null)) {
                    previewImageScene = new PreviewVideoScene(this.LJLJJLL, this.LJLJJL);
                } else {
                    previewImageScene = new PreviewImageScene(this.LJLJJL);
                }
                previewImageScene.LLIIIJ(i, this.LJLJJI);
                previewImageScene.LLJIJIL(myMediaModel);
                this.LJLJL.put(Integer.valueOf(i), previewImageScene);
                LJJIII(viewPager, previewImageScene, i);
                this.LJLILLLLZI.add(id, previewImageScene, LIZ);
                userVisibleHintGroupScene = previewImageScene;
            }
            return userVisibleHintGroupScene;
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
    public final void LJIIIZ(int i, ViewGroup container, Object obj) {
        o.LJIIIZ(container, "container");
        o.LJIIIZ(obj, "obj");
        this.LJLILLLLZI.remove((WM7) obj);
        if ((obj instanceof InterfaceC45640Hvg) && obj != null) {
            this.LJLJL.remove(Integer.valueOf(i));
        }
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

    public final void LJJIII(ViewPager viewPager, UserVisibleHintGroupScene userVisibleHintGroupScene, int i) {
        if (this.LJLJI == null && viewPager.getCurrentItem() == i) {
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

    public C45635Hvb(WMH groupScene, WGT controller, boolean z, CreativeInfo creativeInfo) {
        o.LJIIIZ(groupScene, "groupScene");
        o.LJIIIZ(controller, "controller");
        this.LJLILLLLZI = groupScene;
        this.LJLJJI = controller;
        this.LJLJJL = z;
        this.LJLJJLL = creativeInfo;
        this.LJLJL = new LinkedHashMap();
        this.LJLJLJ = new ArrayList();
    }
}
