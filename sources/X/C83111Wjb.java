package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify;
import com.ss.android.ugc.aweme.shortvideo.beauty.BeautyMetadata;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Wjb, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83111Wjb extends AbstractC82921WgX {
    public final WRP LJIIIZ;
    public final boolean LJIIJ;

    @Override // X.AbstractC82921WgX
    public final BeautyMetadata LIZ() {
        boolean z;
        BeautyMetadata j7 = this.LIZIZ.f7().j7();
        StringBuilder sb = new StringBuilder();
        List<ComposerBeauty> C7 = this.LIZIZ.f7().C7();
        int size = C7.size();
        boolean z2 = true;
        for (int i = 0; i < size; i++) {
            if (this.LIZIZ.f7().LJFF(((ComposerBeauty) ListProtector.get(C7, i)).getCategoryId(), this.LJIIJ)) {
                ((ComposerBeauty) ListProtector.get(C7, i)).setEnable(true);
                if (!((ComposerBeauty) ListProtector.get(C7, i)).isCollectionType()) {
                    if (C1DH.LJIJI((ComposerBeauty) ListProtector.get(C7, i))) {
                        LIZLLL((ComposerBeauty) ListProtector.get(C7, i));
                    }
                } else if (((ComposerBeauty) ListProtector.get(C7, i)).getChildList() != null) {
                    List<ComposerBeauty> childList = ((ComposerBeauty) ListProtector.get(C7, i)).getChildList();
                    o.LJI(childList);
                    if (!childList.isEmpty()) {
                        List<ComposerBeauty> childList2 = ((ComposerBeauty) ListProtector.get(C7, i)).getChildList();
                        o.LJI(childList2);
                        int size2 = childList2.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            List<ComposerBeauty> childList3 = ((ComposerBeauty) ListProtector.get(C7, i)).getChildList();
                            o.LJI(childList3);
                            ComposerBeauty composerBeauty = (ComposerBeauty) ListProtector.get(childList3, i2);
                            composerBeauty.setEnable(true);
                            if (C1DH.LJIJI(composerBeauty)) {
                                LIZLLL(composerBeauty);
                            }
                        }
                        List<ComposerBeauty> childList4 = ((ComposerBeauty) ListProtector.get(C7, i)).getChildList();
                        o.LJI(childList4);
                        Iterator<ComposerBeauty> it = childList4.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (it.next().getEnable()) {
                                    z = true;
                                    break;
                                }
                            } else {
                                z = false;
                                break;
                            }
                        }
                        ((ComposerBeauty) ListProtector.get(C7, i)).setEnable(z);
                    }
                }
                if (!z2) {
                    sb.append(",");
                } else {
                    z2 = false;
                }
                sb.append(((ComposerBeauty) ListProtector.get(C7, i)).getEnable() ? 1 : 0);
            }
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "beautyValid.toString()");
        j7.setBeautyValid(sb2);
        return j7;
    }

    @Override // X.AbstractC82921WgX
    public final void LIZIZ(LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        WRP wrp = this.LJIIIZ;
        if (wrp != null) {
            wrp.setFilterFromStore(false);
        }
    }

    public final void LIZLLL(ComposerBeauty composerBeauty) {
        if (composerBeauty.getExtra().isNone()) {
            int[] LLII = this.LIZ.LLII(composerBeauty.getEffect().getUnzipPath(), "");
            if (LLII.length == 2 && LLII[0] == 0 && LLII[1] == EnumC53635L3f.EXCLUDE.getFlag()) {
                composerBeauty.setEnable(false);
                return;
            }
            return;
        }
        List<ComposerBeautyExtraBeautify.ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
        o.LJI(items);
        Iterator<ComposerBeautyExtraBeautify.ItemsBean> it = items.iterator();
        while (it.hasNext()) {
            int[] LLII2 = this.LIZ.LLII(composerBeauty.getEffect().getUnzipPath(), it.next().getTag());
            if (LLII2.length == 2 && LLII2[0] == 0 && LLII2[1] == EnumC53635L3f.EXCLUDE.getFlag()) {
                composerBeauty.setEnable(false);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83111Wjb(C83185Wkn c83185Wkn, WRP wrp, C83117Wjh c83117Wjh, I37 beautyApiComponent, C5NP c5np, boolean z, boolean z2) {
        super(c83185Wkn, c83117Wjh, beautyApiComponent, wrp, c5np, z);
        o.LJIIIZ(beautyApiComponent, "beautyApiComponent");
        this.LJIIIZ = wrp;
        this.LJIIJ = z2;
    }
}
