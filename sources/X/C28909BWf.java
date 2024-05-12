package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import com.bytedance.android.live.broadcast.model.CreateInfoPerceptionMessage;
import com.bytedance.android.livesdk.broadcast.BannerNotifyEvent;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.BWf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28909BWf {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ() {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(' ');
        LIZ2.append(C15380j0.LJIILJJIL(R.string.lra));
        LIZ2.append(" >");
        return X1D.LIZIZ(LIZ2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [T, android.text.SpannableString, android.text.Spannable] */
    public static C28911BWh LIZIZ(Context context, DataChannel dataChannel, CreateInfoPerceptionMessage createInfoPerceptionMessage, boolean z) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        String str = createInfoPerceptionMessage.subTitle;
        if (str != null) {
            arrayList = new ArrayList();
            StringBuilder sb2 = new StringBuilder();
            int i = 0;
            int i2 = -1;
            for (int i3 = 0; i3 < str.length(); i3++) {
                char charAt = str.charAt(i3);
                if (charAt == '{') {
                    i2 = i;
                } else if (charAt == '}') {
                    if (i2 > 0) {
                        arrayList.add(C47261Igj.LJII(Integer.valueOf(i2), Integer.valueOf(i)));
                    }
                    i2 = -1;
                } else {
                    sb2.append(charAt);
                    i++;
                }
            }
            String sb3 = sb2.toString();
            o.LJIIIIZZ(sb3, "currentStr.toString()");
            sb.append(sb3);
        }
        C68322mC c68322mC = new C68322mC();
        new C68322mC();
        C28910BWg c28910BWg = new C28910BWg(context, createInfoPerceptionMessage, dataChannel);
        ?? spannableString = new SpannableString(createInfoPerceptionMessage.title);
        C23010vJ.LIZJ(context, spannableString, 0, spannableString.length(), 33, 3, 600);
        spannableString.setSpan(new AbsoluteSizeSpan(C15380j0.LIZ(15.0f)), 0, spannableString.length(), 17);
        spannableString.setSpan(c28910BWg, 0, spannableString.length(), 17);
        c68322mC.element = spannableString;
        SpannableString spannableString2 = new SpannableString(sb.toString());
        C23010vJ.LIZJ(context, spannableString2, 0, spannableString2.length(), 33, 6, LiveChatShowDelayForHotLiveSetting.DEFAULT);
        spannableString2.setSpan(new AbsoluteSizeSpan(C15380j0.LIZ(12.0f)), 0, spannableString2.length(), 17);
        spannableString2.setSpan(c28910BWg, 0, spannableString2.length(), 17);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ArrayList arrayList2 = (ArrayList) it.next();
            Object obj = ListProtector.get(arrayList2, 0);
            o.LJIIIIZZ(obj, "data[0]");
            int intValue = ((Number) obj).intValue();
            Object obj2 = ListProtector.get(arrayList2, 1);
            o.LJIIIIZZ(obj2, "data[1]");
            C23010vJ.LJFF(spannableString2, intValue, ((Number) obj2).intValue(), 33, 600);
        }
        BUW buw = BUW.NORMAL_BLOCK;
        T t = c68322mC.element;
        if (t != 0) {
            C28911BWh c28911BWh = new C28911BWh(buw, (SpannableString) t, spannableString2, createInfoPerceptionMessage.detailUrl, createInfoPerceptionMessage.punishInfo);
            if (z) {
                dataChannel.qv0(BannerNotifyEvent.class, c28911BWh);
            }
            return c28911BWh;
        }
        o.LJIJI("titleSpannable");
        throw null;
    }
}
