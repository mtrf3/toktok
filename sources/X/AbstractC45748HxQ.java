package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.scene.group.UserVisibleHintGroupScene;

/* renamed from: X.HxQ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC45748HxQ extends AbstractC45750HxS<UserVisibleHintGroupScene> {
    public final WMH LJLJJI;

    public AbstractC45748HxQ(WMH wmh) {
        this.LJLJJI = wmh;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJIILLIIL(int i, ViewGroup viewGroup) {
        int id = viewGroup.getId();
        if (id != -1) {
            int id2 = viewGroup.getId();
            StringBuilder sb = new StringBuilder("android:switcher:");
            sb.append(id2);
            sb.append(':');
            sb.append(i);
            String sb2 = sb.toString();
            UserVisibleHintGroupScene userVisibleHintGroupScene = (UserVisibleHintGroupScene) this.LJLJJI.findSceneByTag(sb2);
            if (userVisibleHintGroupScene != null) {
                if (this.LJLJI != userVisibleHintGroupScene) {
                    userVisibleHintGroupScene.setUserVisibleHint(false);
                }
                this.LJLJJI.show(userVisibleHintGroupScene);
            } else {
                userVisibleHintGroupScene = (UserVisibleHintGroupScene) LJJIIJ(i, viewGroup);
                if (userVisibleHintGroupScene instanceof InterfaceC45648Hvo) {
                    if (this.LJLJI != userVisibleHintGroupScene) {
                        userVisibleHintGroupScene.setUserVisibleHint(false);
                    }
                    this.LJLILLLLZI.put(i, userVisibleHintGroupScene);
                } else {
                    if (this.LJLJI != userVisibleHintGroupScene) {
                        userVisibleHintGroupScene.setUserVisibleHint(false);
                    }
                    this.LJLJJI.add(id, userVisibleHintGroupScene, sb2);
                }
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

    @Override // X.AbstractC45750HxS
    /* renamed from: LJJIIJZLJL, reason: merged with bridge method [inline-methods] */
    public final UserVisibleHintGroupScene LJJIII(int i, ViewGroup viewGroup) {
        UserVisibleHintGroupScene userVisibleHintGroupScene = (UserVisibleHintGroupScene) this.LJLILLLLZI.get(i);
        if (userVisibleHintGroupScene != null) {
            int id = viewGroup.getId();
            StringBuilder sb = new StringBuilder("android:switcher:");
            sb.append(id);
            sb.append(':');
            sb.append(i);
            String sb2 = sb.toString();
            if (this.LJLJJI.findSceneByTag(sb2) == null) {
                this.LJLJJI.add(viewGroup.getId(), userVisibleHintGroupScene, sb2);
                this.LJLILLLLZI.remove(i);
            }
            return userVisibleHintGroupScene;
        }
        return null;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIIZ(int i, ViewGroup viewGroup, Object obj) {
        WM7 wm7 = (WM7) obj;
        if (wm7.mParentScene != null) {
            this.LJLJJI.remove(wm7);
        } else {
            this.LJLILLLLZI.remove(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [T, com.bytedance.scene.group.UserVisibleHintGroupScene] */
    @Override // X.AbstractC45750HxS, androidx.viewpager.widget.PagerAdapter
    public final void LJIL(int i, ViewGroup viewGroup, Object obj) {
        if (this.LJLILLLLZI.get(i) != null) {
            LJJIII(i, viewGroup);
            LJIIJJI(viewGroup);
        }
        ?? r6 = (UserVisibleHintGroupScene) obj;
        T t = this.LJLJI;
        if (r6 != t) {
            if (t != 0) {
                ((UserVisibleHintGroupScene) t).setUserVisibleHint(false);
            }
            if (r6 != 0) {
                r6.setUserVisibleHint(true);
            }
            this.LJLJI = r6;
        }
    }
}
