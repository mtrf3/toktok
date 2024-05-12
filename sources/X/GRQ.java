package X;

import android.app.Activity;
import android.text.Spannable;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.lexical.platform.span.MentionSpan;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GRQ {
    public final boolean LIZ;

    public GRQ() {
        this(true);
    }

    public GRQ(boolean z) {
        this.LIZ = z;
    }

    public static final Spannable LIZIZ(CharSequence source) {
        o.LJIIIZ(source, "source");
        Spannable newSpannable = Spannable.Factory.getInstance().newSpannable(source);
        o.LJIIIIZZ(newSpannable, "getInstance().newSpannable(source)");
        return newSpannable;
    }

    public final MentionSpan LIZ(Activity activity, Object obj) {
        int intValue;
        AbstractC41507GQt block = (AbstractC41507GQt) obj;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(block, "block");
        String LJIILL = block.LJIILL();
        AVTextExtraStruct aVTextExtraStruct = (AVTextExtraStruct) ORZ.LJLLJ(block.LJI());
        if (this.LIZ) {
            Integer LJI = C79045V0n.LJI(R.attr.go, activity);
            if (LJI != null) {
                intValue = LJI.intValue();
            }
            intValue = -1;
        } else {
            Integer LJI2 = C79045V0n.LJI(R.attr.cl, activity);
            if (LJI2 != null) {
                intValue = LJI2.intValue();
            }
            intValue = -1;
        }
        MentionSpan mentionSpan = new MentionSpan(LJIILL, aVTextExtraStruct.userId, intValue, aVTextExtraStruct.type, aVTextExtraStruct.atUserType, aVTextExtraStruct.getSecUid());
        String str = aVTextExtraStruct.awemeId;
        mentionSpan.awemeId = str;
        mentionSpan.mStruct.setAwemeId(str);
        int i = aVTextExtraStruct.subType;
        mentionSpan.subType = i;
        mentionSpan.mStruct.setSubType(i);
        return mentionSpan;
    }
}
