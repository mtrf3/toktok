package X;

import android.text.SpannableStringBuilder;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.setting.SubscriptionSettingFragmentNew;
import kotlin.jvm.internal.o;

/* renamed from: X.CDw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C30980CDw extends TBS implements InterfaceC88471Ynr<String, Long, SpannableStringBuilder> {
    public C30980CDw(Object obj) {
        super(2, obj, SubscriptionSettingFragmentNew.class, "dealDesPercentContent", "dealDesPercentContent(Ljava/lang/String;J)Landroid/text/SpannableStringBuilder;", 0);
    }

    @Override // X.InterfaceC88471Ynr
    public final SpannableStringBuilder invoke(String str, Long l) {
        String p0 = str;
        long longValue = l.longValue();
        o.LJIIIZ(p0, "p0");
        this.receiver.getClass();
        return SubscriptionSettingFragmentNew.wl(longValue, p0);
    }
}
