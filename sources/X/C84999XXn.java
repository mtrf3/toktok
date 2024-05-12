package X;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.XXn, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84999XXn extends RecyclerView.ViewHolder {
    public final TextView LJLIL;
    public final View LJLILLLLZI;
    public final SY4 LJLJI;
    public final View LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84999XXn(View itemView) {
        super(itemView);
        o.LJIIIZ(itemView, "itemView");
        View findViewById = itemView.findViewById(R.id.mar);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.tv_local_music_hint)");
        this.LJLIL = (TextView) findViewById;
        View findViewById2 = itemView.findViewById(R.id.gd0);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.…ge_local_music_ll_parent)");
        this.LJLILLLLZI = findViewById2;
        View findViewById3 = itemView.findViewById(R.id.g9c);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.…ocal_music_edit_done_btn)");
        this.LJLJI = (SY4) findViewById3;
        View findViewById4 = itemView.findViewById(R.id.gcz);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.manage_local_music_ll)");
        this.LJLJJI = findViewById4;
    }
}
