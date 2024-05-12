package X;

import X.R0Y;
import android.R;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.GoogleApiAvailability;
import java.util.LinkedList;

/* renamed from: X.QyF, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC68731QyF<T extends R0Y> {
    public T LIZ;
    public Bundle LIZIZ;
    public LinkedList<InterfaceC68733QyH> LIZJ;
    public final C13340fi LIZLLL = new C13340fi(this);

    public abstract void LIZ(C13340fi c13340fi);

    public final void LIZJ(int i) {
        while (!this.LIZJ.isEmpty() && this.LIZJ.getLast().LIZIZ() >= i) {
            this.LIZJ.removeLast();
        }
    }

    public final void LIZLLL(Bundle bundle, InterfaceC68733QyH interfaceC68733QyH) {
        if (this.LIZ != null) {
            interfaceC68733QyH.LIZ();
            return;
        }
        if (this.LIZJ == null) {
            this.LIZJ = new LinkedList<>();
        }
        this.LIZJ.add(interfaceC68733QyH);
        if (bundle != null) {
            Bundle bundle2 = this.LIZIZ;
            if (bundle2 == null) {
                this.LIZIZ = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        LIZ(this.LIZLLL);
    }

    public final View LIZIZ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        LIZLLL(bundle, new C68732QyG(this, frameLayout, layoutInflater, viewGroup, bundle));
        if (this.LIZ == null) {
            GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
            Context context = frameLayout.getContext();
            int LLLLLZIL = C16880lQ.LLLLLZIL(googleApiAvailability, context);
            String LIZJ = C67259QaV.LIZJ(LLLLLZIL, context);
            String LIZIZ = C67259QaV.LIZIZ(LLLLLZIL, context);
            LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
            linearLayout.setOrientation(1);
            linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            frameLayout.addView(linearLayout);
            TextView textView = new TextView(frameLayout.getContext());
            textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            textView.setText(LIZJ);
            linearLayout.addView(textView);
            Intent errorResolutionIntent = googleApiAvailability.getErrorResolutionIntent(context, LLLLLZIL, null);
            if (errorResolutionIntent != null) {
                Button button = new Button(context);
                button.setId(R.id.button1);
                button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                button.setText(LIZIZ);
                linearLayout.addView(button);
                C16880lQ.LJIILIIL(button, new ViewOnClickListenerC66618QCo(context, errorResolutionIntent));
            }
        }
        return frameLayout;
    }
}
