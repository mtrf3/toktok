package X;

import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.PoiWriteReviewBottomBarAssemTrigger;
import com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityAbility;

/* renamed from: X.8R8, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8R8 extends AbstractC65781Prl implements InterfaceC88473Ynt<Boolean, String, String, C76800UCe> {
    public final /* synthetic */ PoiWriteReviewBottomBarAssemTrigger LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8R8(PoiWriteReviewBottomBarAssemTrigger poiWriteReviewBottomBarAssemTrigger, String str) {
        super(3);
        this.LJLIL = poiWriteReviewBottomBarAssemTrigger;
        this.LJLILLLLZI = str;
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(Boolean bool, String str, String str2) {
        boolean z;
        Boolean bool2 = bool;
        if (!KR8.LJIIIZ(this.LJLIL)) {
            java.util.Map<String, String> map = this.LJLIL.m4().LJLIL;
            String str3 = this.LJLILLLLZI;
            if (str2 == null) {
                str2 = "";
            }
            map.put(str3, str2);
            BottomBarPriorityAbility l4 = this.LJLIL.l4();
            if (l4 != null) {
                PoiWriteReviewBottomBarAssemTrigger poiWriteReviewBottomBarAssemTrigger = this.LJLIL;
                if (bool2 != null) {
                    z = bool2.booleanValue();
                } else {
                    z = false;
                }
                l4.yZ(poiWriteReviewBottomBarAssemTrigger, z);
            }
        }
        return C76800UCe.LIZ;
    }
}
