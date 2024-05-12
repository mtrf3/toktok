package X;

import android.os.Bundle;
import android.view.View;
import com.bytedance.scene.group.UserVisibleHintGroupScene;
import kotlin.jvm.internal.o;

/* renamed from: X.Hvw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC45656Hvw extends UserVisibleHintGroupScene {
    public boolean LJLIL;

    @Override // X.WM7
    public void onDestroy() {
        super.onDestroy();
        this.LJLIL = false;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WM7
    public void onDestroyView() {
        super.onDestroyView();
        this.LJLIL = false;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WMH, X.WM7
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LJLIL = false;
    }

    @Override // X.WM7
    public void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJLIL = true;
    }
}
