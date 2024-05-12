package X;

import Y.ARunnableS21S0300000_10;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.NbE, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class ViewOnClickListenerC59660NbE extends C59988NgW implements View.OnClickListener {
    public Aweme LJLLI;
    public boolean LJLLILLLL;

    @Override // X.C59988NgW
    public boolean getCanScaleContent() {
        return false;
    }

    @Override // X.C59988NgW
    public boolean getCanScroll() {
        return this.LJLLILLLL;
    }

    private final void setAweme(Aweme aweme) {
        int i;
        String str;
        AwemeRawAd awemeRawAd;
        String string;
        AwemeRawAd awemeRawAd2;
        AwemeRawAd awemeRawAd3;
        if (aweme != null && (awemeRawAd3 = aweme.getAwemeRawAd()) != null) {
            i = awemeRawAd3.getTipsType();
        } else {
            i = -1;
        }
        String str2 = null;
        if (i == 1) {
            C58909NAb.LIZ.getClass();
            if (NH3.LIZ() != null) {
                if (aweme != null && (awemeRawAd2 = aweme.getAwemeRawAd()) != null) {
                    str = awemeRawAd2.getOpenUrl();
                } else {
                    str = null;
                }
                if (NPC.LJI(str)) {
                    View header = getHeader();
                    if (header == null) {
                        header = C16880lQ.LLLZIIL(R.layout.ajl, C16880lQ.LLZIL(getContext()), this);
                    }
                    TextView textView = (TextView) header.findViewById(R.id.t9);
                    if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
                        String schemaName = awemeRawAd.getSchemaName();
                        if (schemaName == null || schemaName.length() == 0) {
                            string = getResources().getString(R.string.b98);
                        } else {
                            string = awemeRawAd.getSchemaName();
                        }
                        str2 = getResources().getString(R.string.b9b, string);
                        o.LJIIIIZZ(str2, "resources.getString(R.st…en_url_title, schemaName)");
                    }
                    textView.setText(str2);
                    C16880lQ.LJIIJ(this, header.findViewById(R.id.t7));
                    C16880lQ.LJIIJ(this, header.findViewById(R.id.t5));
                    this.LJLLILLLL = true;
                    this.LJLLI = aweme;
                    return;
                }
            }
        }
        this.LJLLILLLL = false;
        this.LJLLI = null;
    }

    public final void LIZIZ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        setScrollOffset(0);
        setAweme(aweme);
        if (this.LJLLILLLL) {
            if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
                C55707Ltf c55707Ltf = new C55707Ltf();
                c55707Ltf.LIZ = awemeRawAd;
                c55707Ltf.LIZJ = false;
                C58776N4y.LIZ("draw_ad", "open_card_show", c55707Ltf.LIZ(), awemeRawAd);
            }
            View header = getHeader();
            if (header == null) {
                return;
            }
            postDelayed(new ARunnableS21S0300000_10(header, this, this, 2), 500L);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v) {
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        o.LJIIIZ(v, "v");
        int id = v.getId();
        if (id == R.id.t7) {
            C58909NAb.LIZ.getClass();
            if (NH3.LIZ() != null) {
                NO5.LJIIIZ(getContext(), this.LJLLI);
            }
            Aweme aweme = this.LJLLI;
            if (aweme != null && (awemeRawAd2 = aweme.getAwemeRawAd()) != null) {
                C55707Ltf c55707Ltf = new C55707Ltf();
                c55707Ltf.LIZ = awemeRawAd2;
                c55707Ltf.LIZJ = false;
                C58776N4y.LIZ("draw_ad", "open_card_jump", c55707Ltf.LIZ(), awemeRawAd2);
                return;
            }
            return;
        }
        if (id != R.id.t5) {
            return;
        }
        View header = getHeader();
        if (header != null) {
            postDelayed(new ARunnableS21S0300000_10(header, this, this, 3), 0L);
        }
        Aweme aweme2 = this.LJLLI;
        if (aweme2 != null && (awemeRawAd = aweme2.getAwemeRawAd()) != null) {
            C55707Ltf c55707Ltf2 = new C55707Ltf();
            c55707Ltf2.LIZ = awemeRawAd;
            c55707Ltf2.LIZJ = false;
            C58776N4y.LIZ("draw_ad", "open_card_close", c55707Ltf2.LIZ(), awemeRawAd);
        }
        setAweme(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC59660NbE(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C04560Fw.LIZ(context, "context", attributeSet, "attrs");
        setHeaderId(R.id.t8);
    }
}
