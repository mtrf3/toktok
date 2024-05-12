package X;

import com.ss.android.ugc.aweme.music.assem.list.cell.v2.MusicCellCollectIconAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.9dX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C241319dX extends AbstractC65781Prl implements InterfaceC88471Ynr<MusicCellCollectIconAssem, Boolean, C76800UCe> {
    public static final C241319dX LJLIL = new C241319dX();

    public C241319dX() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(MusicCellCollectIconAssem musicCellCollectIconAssem, Boolean bool) {
        int i;
        MusicCellCollectIconAssem selectSubscribe = musicCellCollectIconAssem;
        boolean booleanValue = bool.booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        T5P t5p = selectSubscribe.LLFF;
        if (t5p != null) {
            if (booleanValue) {
                i = R.drawable.bxt;
            } else {
                i = R.drawable.by9;
            }
            t5p.setImageResource(i);
        }
        return C76800UCe.LIZ;
    }
}
