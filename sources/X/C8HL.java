package X;

import android.content.Context;
import com.ss.android.ugc.aweme.music.assem.list.cell.assem.MusicCellAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.8HL, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8HL extends AbstractC65781Prl implements InterfaceC88471Ynr<MusicCellAssem, Boolean, C76800UCe> {
    public static final C8HL LJLIL = new C8HL();

    public C8HL() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(MusicCellAssem musicCellAssem, Boolean bool) {
        int i;
        MusicCellAssem selectSubscribe = musicCellAssem;
        boolean booleanValue = bool.booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (booleanValue) {
            i = R.raw.icon_3pt_bookmark_fill;
        } else {
            i = R.raw.icon_3pt_bookmark;
        }
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = i;
        c2068389v.LJ = Integer.valueOf(R.attr.go);
        VA9 va9 = (VA9) selectSubscribe.getContainerView().findViewById(R.id.f75);
        Context context = va9.getContext();
        o.LJIIIIZZ(context, "context");
        va9.setImageDrawable(c2068389v.LIZ(context));
        return C76800UCe.LIZ;
    }
}
