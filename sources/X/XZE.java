package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XZE extends LinearLayout implements InterfaceC25830ABu {
    public final boolean LJLIL;
    public final XZI LJLILLLLZI;
    public final XZO LJLJI;
    public XW2 LJLJJI;
    public final C62049OWv LJLJJL;
    public final Context LJLJJLL;

    @Override // X.InterfaceC25830ABu
    public final boolean LJIIJ() {
        return false;
    }

    private final int getBaseRecyclerViewHeight() {
        float f;
        if (this.LJLIL) {
            if (MusicBeanUtilKt.extractAVMusic(this.LJLILLLLZI.Z9().LIZIZ()) == null) {
                f = 0.0f;
            } else {
                f = 64.0f;
            }
        } else {
            f = 48.0f;
        }
        return ((int) (KL2.LJIIIZ(this.LJLJJLL) * (QXF.LIZ() / 100.0f))) - ((int) KL2.LIZJ(this.LJLJJLL, f + 59.0f));
    }

    public final void setCurrentTab(XW2 tab) {
        o.LJIIIZ(tab, "tab");
        this.LJLJJI = tab;
    }

    @Override // X.InterfaceC25830ABu
    public final void I7(TuxSheet sheet, float f) {
        o.LJIIIZ(sheet, "sheet");
        if (QXF.LIZJ()) {
            LIZ(sheet, f);
        }
    }

    public final void LIZ(TuxSheet tuxSheet, float f) {
        int i;
        View view;
        if (f < 0.0f) {
            return;
        }
        float LIZ = QXF.LIZ() / 100.0f;
        if (tuxSheet != null && (view = tuxSheet.getView()) != null) {
            i = (int) ((0.9d - LIZ) * view.getMeasuredHeight() * f * 1.112f);
        } else {
            i = 0;
        }
        this.LJLJJL.setLayoutParams(new LinearLayout.LayoutParams(-1, getBaseRecyclerViewHeight() + i));
    }

    @Override // X.InterfaceC25830ABu
    public final void Pg(TuxSheet sheet, int i) {
        o.LJIIIZ(sheet, "sheet");
        if (QXF.LIZJ() && i == 3) {
            this.LJLJI.LJI(this.LJLJJI.getStringValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XZE(boolean z, XZI musicLogicPresenter, XZO modListener, XW2 currentMusicTab, ActivityC45651qj context) {
        super(context, null, 0);
        o.LJIIIZ(musicLogicPresenter, "musicLogicPresenter");
        o.LJIIIZ(modListener, "modListener");
        o.LJIIIZ(currentMusicTab, "currentMusicTab");
        o.LJIIIZ(context, "context");
        new LinkedHashMap();
        this.LJLIL = z;
        this.LJLILLLLZI = musicLogicPresenter;
        this.LJLJI = modListener;
        this.LJLJJI = currentMusicTab;
        this.LJLJJLL = context;
        View.inflate(context, R.layout.dsx, this);
        View findViewById = getRootView().findViewById(R.id.j3z);
        o.LJIIIIZZ(findViewById, "this.rootView.findViewById(R.id.rl2)");
        this.LJLJJL = (C62049OWv) findViewById;
    }
}
