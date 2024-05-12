package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.broadcast.TtLiveBackgroundSetting;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.1Ik, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30701Ik extends RecyclerView.ViewHolder {
    public final View LJLIL;
    public final C47061t0 LJLILLLLZI;

    public C30701Ik(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.hoj);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.photo_select_icon)");
        this.LJLIL = findViewById;
        View findViewById2 = view.findViewById(R.id.ho5);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.photo_icon)");
        this.LJLILLLLZI = (C47061t0) findViewById2;
        if (U4D.LIZ() || (TtLiveBackgroundSetting.INSTANCE.enable() && C29306Beo.LJIILJJIL())) {
            findViewById.setBackgroundResource(R.drawable.crg);
        }
    }
}
