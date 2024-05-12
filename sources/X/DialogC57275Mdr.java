package X;

import Y.ACListenerS29S0100000_9;
import android.content.Context;
import android.os.Build;
import android.text.Html;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgChannelPopup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Mdr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class DialogC57275Mdr extends DialogC26391AXj {
    public static boolean LJLJI = true;
    public static DialogC57275Mdr LJLJJI;
    public static boolean LJLJJL;
    public final boolean LJLIL;
    public final boolean LJLILLLLZI;

    @Override // android.app.Dialog
    public final void show() {
        if (this.LJLIL) {
            try {
                if (!new C03880Dg(2).LIZJ(300000, "com/ss/android/ugc/aweme/views/ResizableDialog", "show", this, new Object[0], "void", new C65300Pk0(false, "()V", "6356418836981058109")).LIZ) {
                    super.show();
                }
            } catch (Exception unused) {
            }
            try {
                if (this.LJLILLLLZI) {
                    C188727au c188727au = new C188727au();
                    c188727au.LJIIIZ("toast_type", "coupon_fission");
                    FMX.LJIIL("toast_show", c188727au.LIZ);
                }
                LV0.LJII.LIZJ.LIZ(2);
            } catch (C158056If unused2) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC57275Mdr(Context context, UgChannelPopup popupInfo) {
        super(context, R.style.a95, false, true);
        UgChannelPopup channelPopup;
        String h5Link;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(popupInfo, "popupInfo");
        this.LJLIL = true;
        try {
            Integer imageStyle = popupInfo.getImageStyle();
            int style = EnumC57278Mdu.BANNER.getStyle();
            if (imageStyle != null && imageStyle.intValue() == style) {
                this.LJLILLLLZI = true;
            }
        } catch (C158056If unused) {
            this.LJLILLLLZI = false;
        }
        if (this.LJLILLLLZI) {
            setContentView(R.layout.amc);
        } else {
            setContentView(R.layout.amr);
        }
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        setOnKeyListener(DialogInterfaceOnKeyListenerC57279Mdv.LJLIL);
        C16880lQ.LJJJ((TuxIconView) findViewById(R.id.bfb), new ACListenerS29S0100000_9(this, 4));
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                ((TextView) findViewById(R.id.l9s)).setText(Html.fromHtml(popupInfo.getTitle(), 63));
            } else {
                ((TextView) findViewById(R.id.l9s)).setText(Html.fromHtml(popupInfo.getTitle()));
            }
        } catch (C158056If unused2) {
        }
        try {
            ((TextView) findViewById(R.id.bt4)).setText(popupInfo.getContent());
        } catch (C158056If unused3) {
        }
        try {
            ((TextView) findViewById(R.id.b1h)).setText(popupInfo.getButtonText());
        } catch (C158056If unused4) {
        }
        try {
            UrlModel urlModel = new UrlModel();
            try {
                urlModel.setUrlList(popupInfo.getResourceUrl().getUrlList());
                urlModel.setUri(popupInfo.getResourceUrl().getUri());
            } catch (C158056If unused5) {
            }
            if (this.LJLILLLLZI) {
                C78765Uvh.LJFF((C62846OlW) findViewById(R.id.ea8), urlModel);
            } else {
                C78765Uvh.LJIILJJIL(urlModel, 0, 0, new C57277Mdt(this, urlModel));
            }
            UgAwemeActivitySetting ugAwemeActivitySetting = LV0.LJII.LIZ;
            if (ugAwemeActivitySetting != null && (channelPopup = ugAwemeActivitySetting.getChannelPopup()) != null && (h5Link = channelPopup.getH5Link()) != null) {
                C16880lQ.LJJJJI((TuxTextView) findViewById(R.id.b1h), new ViewOnClickListenerC57274Mdq(h5Link, this));
            } else {
                this.LJLIL = false;
            }
        } catch (C158056If unused6) {
            this.LJLIL = false;
        }
    }
}
