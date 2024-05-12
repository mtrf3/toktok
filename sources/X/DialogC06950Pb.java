package X;

import Y.IDCListenerS135S0100000;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.AppCompatImageView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.0Pb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogC06950Pb extends Dialog {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final JSONObject LJLJI;
    public View LJLJJI;

    @Override // android.app.Dialog
    public final void onBackPressed() {
        String str;
        super.onBackPressed();
        if (this.LJLILLLLZI == 3) {
            str = "double_side";
        } else {
            str = "single_side";
        }
        C0U3.LIZLLL(str, "photo_guidance", "return", this.LJLJI);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        setContentView(R.layout.d1u);
        setCanceledOnTouchOutside(false);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -2);
        }
        if (this.LJLIL == 0 || (i = this.LJLILLLLZI) == 0) {
            View ttlive_kyc_guidance_image_double_container = findViewById(R.id.lq3);
            o.LJIIIIZZ(ttlive_kyc_guidance_image_double_container, "ttlive_kyc_guidance_image_double_container");
            C87277YNd.LJJIIZ(ttlive_kyc_guidance_image_double_container);
            View ttlive_kyc_guidance_image_single = findViewById(R.id.lq6);
            o.LJIIIIZZ(ttlive_kyc_guidance_image_single, "ttlive_kyc_guidance_image_single");
            C87277YNd.LJJIJ(ttlive_kyc_guidance_image_single);
            ((AppCompatImageView) findViewById(R.id.lq6)).setImageResource(R.drawable.cw3);
        } else if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    View ttlive_kyc_guidance_image_double_container2 = findViewById(R.id.lq3);
                    o.LJIIIIZZ(ttlive_kyc_guidance_image_double_container2, "ttlive_kyc_guidance_image_double_container");
                    C87277YNd.LJJIJ(ttlive_kyc_guidance_image_double_container2);
                    View ttlive_kyc_guidance_image_single2 = findViewById(R.id.lq6);
                    o.LJIIIIZZ(ttlive_kyc_guidance_image_single2, "ttlive_kyc_guidance_image_single");
                    C87277YNd.LJJIIZ(ttlive_kyc_guidance_image_single2);
                }
            } else {
                View ttlive_kyc_guidance_image_double_container3 = findViewById(R.id.lq3);
                o.LJIIIIZZ(ttlive_kyc_guidance_image_double_container3, "ttlive_kyc_guidance_image_double_container");
                C87277YNd.LJJIIZ(ttlive_kyc_guidance_image_double_container3);
                View ttlive_kyc_guidance_image_single3 = findViewById(R.id.lq6);
                o.LJIIIIZZ(ttlive_kyc_guidance_image_single3, "ttlive_kyc_guidance_image_single");
                C87277YNd.LJJIJ(ttlive_kyc_guidance_image_single3);
                ((AppCompatImageView) findViewById(R.id.lq6)).setImageResource(R.drawable.cw1);
            }
        } else {
            View ttlive_kyc_guidance_image_double_container4 = findViewById(R.id.lq3);
            o.LJIIIIZZ(ttlive_kyc_guidance_image_double_container4, "ttlive_kyc_guidance_image_double_container");
            C87277YNd.LJJIIZ(ttlive_kyc_guidance_image_double_container4);
            View ttlive_kyc_guidance_image_single4 = findViewById(R.id.lq6);
            o.LJIIIIZZ(ttlive_kyc_guidance_image_single4, "ttlive_kyc_guidance_image_single");
            C87277YNd.LJJIJ(ttlive_kyc_guidance_image_single4);
            ((AppCompatImageView) findViewById(R.id.lq6)).setImageResource(R.drawable.cw2);
        }
        View findViewById = findViewById(R.id.lq8);
        this.LJLJJI = findViewById;
        if (findViewById != null) {
            C16880lQ.LJIIJ(new IDCListenerS135S0100000(this, 63), findViewById);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC06950Pb(Context context, int i, int i2, JSONObject jSONObject) {
        super(context, R.style.ac6);
        o.LJIIIZ(context, "context");
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = jSONObject;
    }
}
