package Y;

import X.C145995oB;
import X.C1555868s;
import X.C19K;
import X.FMX;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishFragment;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes3.dex */
public class IDCListenerS371S0100000_2 implements View.OnFocusChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (this.$t) {
            case 0:
                onFocusChange$0(this, view, z);
                return;
            case 1:
                onFocusChange$1(this, view, z);
                return;
            default:
                return;
        }
    }

    public IDCListenerS371S0100000_2(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onFocusChange$0(IDCListenerS371S0100000_2 iDCListenerS371S0100000_2, View view, boolean z) {
        String str;
        String obj;
        if (z) {
            C145995oB c145995oB = new C145995oB();
            VideoPublishEditModel videoPublishEditModel = ((FTCVideoPublishFragment) iDCListenerS371S0100000_2.l0).LJLIL;
            if (videoPublishEditModel != null) {
                c145995oB.LJI("creation_id", videoPublishEditModel.getCreationId());
                Editable text = ((C19K) ((FTCVideoPublishFragment) iDCListenerS371S0100000_2.l0)._$_findCachedViewById(R.id.czk)).getText();
                if (text != null && (obj = text.toString()) != null) {
                    str = s.LJZI(obj).toString();
                } else {
                    str = null;
                }
                c145995oB.LJI("desc_detail", str);
                VideoPublishEditModel videoPublishEditModel2 = ((FTCVideoPublishFragment) iDCListenerS371S0100000_2.l0).LJLIL;
                if (videoPublishEditModel2 != null) {
                    int i = videoPublishEditModel2.draftId;
                    if (i != 0) {
                        c145995oB.LIZ(i, "draft_id");
                    }
                    FMX.LJIIL("describe_video", c145995oB.LIZ);
                    return;
                }
                o.LJIJI("mModel");
                throw null;
            }
            o.LJIJI("mModel");
            throw null;
        }
    }

    public static final void onFocusChange$1(IDCListenerS371S0100000_2 iDCListenerS371S0100000_2, View view, boolean z) {
        if ((view instanceof EditText) && ((C1555868s) iDCListenerS371S0100000_2.l0).getEditable()) {
            if (z) {
                ((TextView) view).setHint(" ");
                return;
            }
            EditText editText = (EditText) view;
            Editable text = editText.getText();
            if (text == null || text.length() == 0) {
                editText.setHint(((C1555868s) iDCListenerS371S0100000_2.l0).getHintString());
            } else {
                editText.setHint(" ");
            }
        }
    }
}
