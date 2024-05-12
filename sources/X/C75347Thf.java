package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.liveinteract.voicechat.main.common.mask.MaskViewModel$fanTicketCount$2$1;

/* renamed from: X.Thf, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75347Thf extends AbstractC65781Prl implements InterfaceC65784Pro<MaskViewModel$fanTicketCount$2$1> {
    public static final C75347Thf LJLIL = new C75347Thf();

    public C75347Thf() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.android.live.liveinteract.voicechat.main.common.mask.MaskViewModel$fanTicketCount$2$1] */
    @Override // X.InterfaceC65784Pro
    public final MaskViewModel$fanTicketCount$2$1 invoke() {
        return new MutableLiveData<Long>() { // from class: com.bytedance.android.live.liveinteract.voicechat.main.common.mask.MaskViewModel$fanTicketCount$2$1
            @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
            public void setValue(Long l) {
                Long value = getValue();
                if (value == null) {
                    super.setValue((MaskViewModel$fanTicketCount$2$1) l);
                    return;
                }
                long longValue = value.longValue();
                if (l != null) {
                    if (l.longValue() < longValue) {
                        return;
                    }
                    super.setValue((MaskViewModel$fanTicketCount$2$1) l);
                    return;
                }
                super.setValue((MaskViewModel$fanTicketCount$2$1) l);
            }
        };
    }
}
