package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.music.model.Music;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.7Xy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C187627Xy extends FrameLayout {
    public final void setMusic(Music music) {
        o.LJIIIZ(music, "music");
        C7YE.LIZJ(this, music);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C187627Xy(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        C16880lQ.LLLZIIL(R.layout.bv8, C16880lQ.LLZIL(context), this);
        View findViewById = findViewById(R.id.gt_);
        if (findViewById != null) {
            int LJIJJLI = C63081OpJ.LJIJJLI(context, 16.0f);
            findViewById.setPadding(0, LJIJJLI, 0, LJIJJLI);
        }
    }
}
