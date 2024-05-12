package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.read.viewmodel.ReadStateViewModel;

/* renamed from: X.3zj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C102193zj {
    public static ReadStateViewModel LIZ(Fragment fragment) {
        ReadStateViewModel readStateViewModel = (ReadStateViewModel) ViewModelProviders.of(fragment).get(ReadStateViewModel.class);
        if (readStateViewModel.LJLILLLLZI) {
            return readStateViewModel;
        }
        return null;
    }
}
