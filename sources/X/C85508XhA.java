package X;

import android.text.Editable;
import android.text.TextWatcher;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditData;
import com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditItem;
import java.util.List;

/* renamed from: X.XhA, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85508XhA implements TextWatcher {
    public final /* synthetic */ CreatorCaptionEditItem LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ C85513XhF LJLJI;
    public final /* synthetic */ C85511XhD LJLJJI;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        CreatorCaptionEditData creatorCaptionEditData;
        List<CreatorCaptionEditData> transSubtitleItem = this.LJLIL.getTransSubtitleItem();
        if (transSubtitleItem != null && (creatorCaptionEditData = (CreatorCaptionEditData) ListProtector.get(transSubtitleItem, this.LJLILLLLZI)) != null) {
            creatorCaptionEditData.setText(this.LJLJI.LJLIL.getText().toString());
        }
        this.LJLJJI.LJLIL.lv0();
    }

    public C85508XhA(CreatorCaptionEditItem creatorCaptionEditItem, int i, C85513XhF c85513XhF, C85511XhD c85511XhD) {
        this.LJLIL = creatorCaptionEditItem;
        this.LJLILLLLZI = i;
        this.LJLJI = c85513XhF;
        this.LJLJJI = c85511XhD;
    }
}
