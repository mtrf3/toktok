package X;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BIG extends RecyclerView.ViewHolder {
    public boolean LJLIL;
    public final C47121t6 LJLILLLLZI;
    public final LinearLayout LJLJI;

    public BIG(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.m7h);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.tv_game_item_name)");
        this.LJLILLLLZI = (C47121t6) findViewById;
        View findViewById2 = view.findViewById(R.id.j4v);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.rl_game_event)");
        this.LJLJI = (LinearLayout) findViewById2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L(boolean r9, com.bytedance.android.livesdk.game.model.PartnershipGameEvent r10) {
        /*
            r8 = this;
            if (r9 == 0) goto L6f
            android.widget.LinearLayout r0 = r8.LJLJI
            int r0 = r0.getVisibility()
            r1 = 0
            r3 = 1
            if (r0 != 0) goto Ld
        Lc:
            return
        Ld:
            android.widget.LinearLayout r0 = r8.LJLJI
            r0.setVisibility(r1)
            boolean r0 = r8.LJLIL
            if (r0 == 0) goto L17
            goto Lc
        L17:
            if (r10 == 0) goto L22
            java.lang.String r0 = r10.gameIdStr     // Catch: java.lang.Exception -> L25
            if (r0 == 0) goto L22
            long r5 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r0)     // Catch: java.lang.Exception -> L25
            goto L3b
        L22:
            r5 = 0
            goto L3b
        L25:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "gameId is not number in reportGameTagShowEvent, e:"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C0NB.LIZLLL(r0)
            r5 = -1
        L3b:
            r8.LJLIL = r3
            java.lang.String r0 = "livesdk_gamepad_page_show"
            X.BZI r2 = X.C28787BRn.LIZ(r0)
            r2.LJIIZILJ()
            java.lang.String r1 = "page_from"
            java.lang.String r0 = "live_start"
            r2.LJIJJ(r0, r1)
            java.lang.String r1 = "page_name"
            java.lang.String r0 = "topic_show"
            r2.LJIJJ(r0, r1)
            r1 = 0
            if (r10 == 0) goto L6d
            java.lang.String r3 = r10.gameName
        L59:
            java.lang.String r4 = "game_name"
            java.lang.String r7 = "game_id"
            X.C06530Nl.LIZLLL(r2, r3, r4, r5, r7)
            if (r10 == 0) goto L64
            java.lang.String r1 = r10.taskIdStr
        L64:
            java.lang.String r0 = "game_task_id"
            r2.LJIJJ(r1, r0)
            r2.LJJIIJZLJL()
            goto Lc
        L6d:
            r3 = r1
            goto L59
        L6f:
            android.widget.LinearLayout r1 = r8.LJLJI
            r0 = 8
            r1.setVisibility(r0)
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BIG.L(boolean, com.bytedance.android.livesdk.game.model.PartnershipGameEvent):void");
    }
}
