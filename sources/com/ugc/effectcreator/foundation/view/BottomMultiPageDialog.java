package com.ugc.effectcreator.foundation.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public class BottomMultiPageDialog extends BottomDialog {
    public FrameLayout LJLJI;

    @Override // com.ugc.effectcreator.foundation.view.BottomDialog
    public final void _$_clearFindViewByIdCache() {
    }

    @Override // com.ugc.effectcreator.foundation.view.BottomDialog, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    @Override // com.ugc.effectcreator.foundation.view.BottomDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
    }

    @Override // com.ugc.effectcreator.foundation.view.BottomDialog
    public final View xl(LayoutInflater inflater, ViewGroup viewGroup) {
        o.LJIIIZ(inflater, "inflater");
        FrameLayout frameLayout = new FrameLayout(requireContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.LJLJI = frameLayout;
        frameLayout.setId(R.id.nlq);
        FrameLayout frameLayout2 = this.LJLJI;
        if (frameLayout2 != null) {
            return frameLayout2;
        }
        o.LJIJI("mContainer");
        throw null;
    }
}
