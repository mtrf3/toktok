package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.discover.model.ShowItemsStruct;
import java.util.List;

/* renamed from: X.Si3, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72823Si3 implements InterfaceC80680VlU {
    public final /* synthetic */ T6D LIZ;

    @Override // X.InterfaceC80680VlU
    public final void LIZ(C80674VlO c80674VlO) {
    }

    @Override // X.InterfaceC80680VlU
    public final void LIZIZ(C80674VlO c80674VlO) {
    }

    public C72823Si3(T6D t6d) {
        this.LIZ = t6d;
    }

    @Override // X.InterfaceC80680VlU
    public final void LIZJ(C80674VlO c80674VlO) {
        String str;
        List<ShowItemsStruct> list;
        ShowItemsStruct showItemsStruct;
        if (c80674VlO != null) {
            int i = c80674VlO.LJ;
            T6D t6d = this.LIZ;
            String str2 = null;
            if (i == 0) {
                str = "output";
            } else {
                Challenge challenge = t6d.LJFF;
                if (challenge != null && (list = challenge.showItems) != null && (showItemsStruct = (ShowItemsStruct) ListProtector.get(list, i - 1)) != null) {
                    str = showItemsStruct.getType();
                } else {
                    str = null;
                }
            }
            t6d.getClass();
            C188727au c188727au = new C188727au();
            Challenge challenge2 = t6d.LJFF;
            if (challenge2 != null) {
                str2 = challenge2.getCid();
            }
            c188727au.LJIIIZ("tag_id", str2);
            c188727au.LJIIIZ("tag_name", str);
            FMX.LJIIL("change_inter_tag", c188727au.LIZ);
        }
    }
}
