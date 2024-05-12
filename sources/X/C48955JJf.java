package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.JJf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48955JJf extends JNU {
    public static final /* synthetic */ int LJLJLLL = 0;
    public final C62822Ol8 LJLJL;
    public C48954JJe LJLJLJ;

    public C48955JJf(View view) {
        super(view);
        this.LJLJL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 576));
        View findViewById = this.itemView.findViewById(R.id.aob);
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZ = 637534208;
        c110614Vt.LJIIIIZZ = Float.valueOf(C32151Nz.LJIIZILJ(5));
        c110614Vt.LJIIJJI = Float.valueOf(C32151Nz.LJIIZILJ(5));
        Context context = this.itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        findViewById.setBackground(c110614Vt.LIZ(context));
    }

    public final void P(java.util.Map map, boolean z) {
        String str;
        String str2;
        Aweme aweme;
        Aweme aweme2;
        Aweme aweme3;
        HashMap hashMap = new HashMap();
        hashMap.putAll(map);
        hashMap.put("aladdin_rank", String.valueOf(getLayoutPosition()));
        C48954JJe c48954JJe = this.LJLJLJ;
        String str3 = null;
        if (c48954JJe != null && (aweme3 = c48954JJe.LIZ) != null) {
            str = aweme3.getAid();
        } else {
            str = null;
        }
        hashMap.put("list_item_id", str);
        hashMap.put("list_result_type", "video");
        if (z) {
            hashMap.put("button_type", "click_video");
            FMX.LJIIL("search_result_click", hashMap);
            C48954JJe c48954JJe2 = this.LJLJLJ;
            if (c48954JJe2 != null && (aweme2 = c48954JJe2.LIZ) != null) {
                str2 = aweme2.getGroupId();
            } else {
                str2 = null;
            }
            hashMap.put("group_id", str2);
            C48954JJe c48954JJe3 = this.LJLJLJ;
            if (c48954JJe3 != null && (aweme = c48954JJe3.LIZ) != null) {
                str3 = aweme.getAuthorUid();
            }
            hashMap.put("author_id", str3);
            FMX.LJIIL("feed_enter", hashMap);
            return;
        }
        FMX.LJIIL("search_result_show", hashMap);
    }
}
