package X;

import android.text.TextUtils;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.ugc.android.editor.core.EditorProContext;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS57S1200000_2;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* renamed from: X.5ay, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C137805ay extends AnonymousClass503 {
    public final ActivityC45651qj LJLIL;
    public final VideoPublishEditModel LJLILLLLZI;
    public final EditorProContext LJLJI;
    public final C62822Ol8 LJLJJI;
    public ProgressDialogC43239Gy3 LJLJJL;
    public final C64962gm LJLJJLL;
    public boolean LJLJL;

    @Override // X.AnonymousClass503, X.InterfaceC132255Gz
    public final void onDestroy() {
        this.LJLJL = true;
        C48841JEv.LIZJ(this.LJLJJLL, null);
    }

    public static void LJIILJJIL(C137805ay c137805ay, InterfaceC88472Yns callback) {
        c137805ay.getClass();
        o.LJIIIZ(callback, "callback");
        C43045Guv.LIZLLL(new AqS57S1200000_2(c137805ay, (C137805ay) callback, (InterfaceC88472Yns<? super Boolean, C76800UCe>) "", (String) 1), 0L);
    }

    public C137805ay(ActivityC45651qj activity, VideoPublishEditModel videoPublishEditModel, EditorProContext editorContext) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(editorContext, "editorContext");
        this.LJLIL = activity;
        this.LJLILLLLZI = videoPublishEditModel;
        this.LJLJI = editorContext;
        this.LJLJJI = C221108m2.LIZIZ(C1289854k.LJLIL);
        this.LJLJJLL = C48841JEv.LIZIZ();
    }

    public final void LJIILL(boolean z, String str, NLETrackSlot nLETrackSlot, String str2, final InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        if (TextUtils.isEmpty(str)) {
            interfaceC88472Yns.invoke(Boolean.FALSE);
            return;
        }
        o.LJI(str);
        ProgressDialogC43239Gy3 progressDialogC43239Gy3 = this.LJLJJL;
        if (progressDialogC43239Gy3 != null) {
            progressDialogC43239Gy3.cancel();
        }
        ProgressDialogC43239Gy3 LIZJ = C42034Gec.LIZJ(this.LJLIL, EnumC42288Gii.VISIBLE, new InterfaceC43240Gy4() { // from class: X.5b1
            @Override // X.InterfaceC43240Gy4
            public final void LIZIZ() {
                interfaceC88472Yns.invoke(Boolean.FALSE);
                C137805ay c137805ay = this;
                c137805ay.LJLJL = true;
                C48841JEv.LIZJ(c137805ay.LJLJJLL, null);
            }
        });
        this.LJLJJL = LIZJ;
        LIZJ.setMessage(this.LJLIL.getString(R.string.rjz));
        ProgressDialogC43239Gy3 progressDialogC43239Gy32 = this.LJLJJL;
        o.LJI(progressDialogC43239Gy32);
        if (!new C03880Dg(2).LIZJ(300000, "com/ss/android/ugc/aweme/view/DoubleBallLoadingDialog", "show", progressDialogC43239Gy32, new Object[0], "void", new C65300Pk0(false, "()V", "-4121443194904338223")).LIZ) {
            progressDialogC43239Gy32.show();
        }
        if (!C167496hl.LIZIZ(str)) {
            ActivityC45651qj activityC45651qj = this.LJLIL;
            if (activityC45651qj != null) {
                C78920UyC.LIZLLL(R.string.e49, activityC45651qj, 1019);
            }
            ProgressDialogC43239Gy3 progressDialogC43239Gy33 = this.LJLJJL;
            if (progressDialogC43239Gy33 != null) {
                progressDialogC43239Gy33.dismiss();
                return;
            }
            return;
        }
        XKX.LIZLLL(this.LJLJJLL, new C137845b2(CoroutineExceptionHandler.LJJJJIZL, this, interfaceC88472Yns), null, new C137785aw(this, interfaceC88472Yns, nLETrackSlot, str, str2, z, null), 2);
    }
}
