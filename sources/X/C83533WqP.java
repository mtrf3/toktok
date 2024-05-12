package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.sticker.EffectSdkExtra;
import com.ss.android.ugc.aweme.sticker.PlDataBean;
import kotlin.jvm.internal.o;

/* renamed from: X.WqP, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C83533WqP implements Parcelable.Creator<EffectSdkExtra> {
    @Override // android.os.Parcelable.Creator
    public final EffectSdkExtra createFromParcel(Parcel in) {
        o.LJIIIZ(in, "in");
        return new EffectSdkExtra(PlDataBean.CREATOR.createFromParcel(in));
    }

    @Override // android.os.Parcelable.Creator
    public final EffectSdkExtra[] newArray(int i) {
        return new EffectSdkExtra[i];
    }
}
