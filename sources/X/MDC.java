package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.notification.bean.UnSubscribeSettingsData;
import java.util.List;

/* loaded from: classes10.dex */
public final class MDC extends AbstractC65781Prl implements InterfaceC88473Ynt<Integer, Integer, Boolean, C76800UCe> {
    public final /* synthetic */ MDB LJLIL;
    public final /* synthetic */ MDD LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MDC(MDB mdb, MDD mdd, boolean z) {
        super(3);
        this.LJLIL = mdb;
        this.LJLILLLLZI = mdd;
        this.LJLJI = z;
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(Integer num, Integer num2, Boolean bool) {
        int i;
        num.intValue();
        num2.intValue();
        bool.booleanValue();
        List<UnSubscribeSettingsData> list = this.LJLIL.LJLJI;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        if (i > this.LJLILLLLZI.LJLILLLLZI) {
            C221018lt.LJFF("SystemNotificationSettingAdapter", "update data");
            MDD mdd = this.LJLILLLLZI;
            UnSubscribeSettingsData unSubscribeSettingsData = mdd.LJLIL;
            if (unSubscribeSettingsData != null) {
                boolean z = this.LJLJI;
                MDB mdb = this.LJLIL;
                UnSubscribeSettingsData LIZ = UnSubscribeSettingsData.LIZ(unSubscribeSettingsData, !z);
                mdd.LJLIL = LIZ;
                List<UnSubscribeSettingsData> list2 = mdb.LJLJI;
                if (list2 != null) {
                    ListProtector.set(list2, mdd.LJLILLLLZI, LIZ);
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
