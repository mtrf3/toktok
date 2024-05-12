package X;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* renamed from: X.5LS, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5LS {
    public final InterfaceC142545ic LIZ;
    public final VideoPublishEditModel LIZIZ;
    public final LiveData<C5M2> LIZJ;
    public C5LR LIZLLL;
    public final InterfaceC153045zY LJ;
    public ProgressDialogC173696rl LJFF;
    public int LJI;
    public InterfaceC65784Pro<C76800UCe> LJII;

    public C5LS(InterfaceC142545ic editPreviewApi, VideoPublishEditModel editModel, MutableLiveData tabSelected) {
        o.LJIIIZ(editPreviewApi, "editPreviewApi");
        o.LJIIIZ(editModel, "editModel");
        o.LJIIIZ(tabSelected, "tabSelected");
        this.LIZ = editPreviewApi;
        this.LIZIZ = editModel;
        this.LIZJ = tabSelected;
        this.LJ = editPreviewApi.Kh().getValue();
    }
}
