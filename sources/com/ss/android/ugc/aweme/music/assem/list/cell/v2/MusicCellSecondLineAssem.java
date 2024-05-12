package com.ss.android.ugc.aweme.music.assem.list.cell.v2;

import X.C47704Ins;
import X.C55749LuL;
import X.C77123UOp;
import android.content.Context;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.music.OriginMusicArg;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class MusicCellSecondLineAssem extends DefaultSecondLineAssem {
    public final C55749LuL LLFFF;

    public MusicCellSecondLineAssem() {
        new LinkedHashMap();
        this.LLFFF = new C55749LuL(C47704Ins.LIZJ(this, OriginMusicArg.class, null), checkSupervisorPrepared());
    }

    @Override // com.ss.android.ugc.aweme.music.assem.list.cell.v2.DefaultSecondLineAssem
    public final void m4(MusicModel model) {
        String str;
        o.LJIIIZ(model, "model");
        if (((OriginMusicArg) this.LLFFF.getValue()).isMe()) {
            Context context = getContext();
            if (context != null) {
                str = context.getString(R.string.jdo, Integer.valueOf(model.getUserCount()));
            } else {
                str = null;
            }
        } else {
            Context context2 = getContext();
            if (context2 == null || (str = context2.getString(R.string.jdo, C77123UOp.LJJIIJ(model.getUserCount()))) == null) {
                str = "";
            }
        }
        TuxTextView tuxTextView = this.LLFF;
        if (tuxTextView == null) {
            return;
        }
        tuxTextView.setText(str);
    }
}
