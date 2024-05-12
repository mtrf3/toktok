package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.aUe, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93672aUe extends LinearLayout {
    public C93672aUe(Context context) {
        super(context, null, 0);
        setOrientation(1);
        C16880lQ.LLLZIIL(R.layout.dvb, C16880lQ.LLZIL(context), this);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.setMargins(0, 0, 0, C93742aVm.LIZIZ(28));
        setLayoutParams(marginLayoutParams);
    }

    public final void setAdapter(AbstractC94454ahG adapter) {
        o.LJIIIZ(adapter, "adapter");
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.nov);
        recyclerView.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.LLJJIII(0);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);
    }

    public final void setTitle(String title) {
        o.LJIIIZ(title, "title");
        View findViewById = findViewById(R.id.mby);
        o.LJIIIIZZ(findViewById, "findViewById<TextView>(R.id.tv_name)");
        ((TextView) findViewById).setText(title);
    }
}
