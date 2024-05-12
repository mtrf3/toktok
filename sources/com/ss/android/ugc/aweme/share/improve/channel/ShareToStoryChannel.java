package com.ss.android.ugc.aweme.share.improve.channel;

import X.AbstractC62625Ohx;
import X.C2068389v;
import X.C29701Eo;
import X.C41831GbL;
import X.C55723Ltv;
import X.C77870UhG;
import X.GZP;
import X.InterfaceC62573Oh7;
import X.ORZ;
import Y.IDObjectS331S0100000_10;
import Y.IDObjectS4S0101000_10;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.channel.share.model.PureLogicChannel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class ShareToStoryChannel extends PureLogicChannel {
    public final Aweme LJLIL;
    public final Context LJLILLLLZI;
    public final GZP LJLJI;
    public final String LJLJJI;
    public int LJLJJL;
    public boolean LJLJJLL;

    @Override // X.InterfaceC62225ObV
    public final boolean LIZ(Context context, AbstractC62625Ohx content) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(content, "content");
        return true;
    }

    @Override // X.InterfaceC62225ObV
    public final Drawable LIZJ(Context context) {
        return null;
    }

    @Override // X.InterfaceC62225ObV
    public final String key() {
        return "share_to_story";
    }

    @Override // X.InterfaceC62225ObV
    public final String label() {
        String string = this.LJLILLLLZI.getString(R.string.r5w);
        o.LJIIIIZZ(string, "context.getString(R.string.share_to_story_entry)");
        return string;
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.PureLogicChannel, X.InterfaceC62225ObV
    public final void LJFF(View itemView) {
        ViewGroup viewGroup;
        o.LJIIIZ(itemView, "itemView");
        if ((itemView instanceof ViewGroup) && (viewGroup = (ViewGroup) itemView) != null) {
            IDObjectS331S0100000_10 iDObjectS331S0100000_10 = new IDObjectS331S0100000_10(viewGroup, 1);
            ArrayList arrayList = new ArrayList();
            Iterator it = iDObjectS331S0100000_10.iterator();
            while (true) {
                IDObjectS4S0101000_10 iDObjectS4S0101000_10 = (IDObjectS4S0101000_10) it;
                if (!iDObjectS4S0101000_10.hasNext()) {
                    break;
                }
                Object next = iDObjectS4S0101000_10.next();
                if (next instanceof C77870UhG) {
                    arrayList.add(next);
                }
            }
            C29701Eo c29701Eo = (C29701Eo) ORZ.LJLLLLLL(0, arrayList);
            if (c29701Eo == null) {
                return;
            }
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_color_story_circle;
            c29701Eo.setImageDrawable(c2068389v.LIZ(this.LJLILLLLZI));
        }
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.PureLogicChannel, X.InterfaceC62225ObV
    public final void LJIIJJI(int i) {
        this.LJLJJL = i;
        if (!this.LJLJJLL) {
            this.LJLJJLL = true;
            this.LJLJI.LJIIJ("share_to_story_show", this.LJLIL, new AqS176S0100000_10(this, 189));
        }
    }

    public ShareToStoryChannel(Context context, Bundle extras, Aweme aweme) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(extras, "extras");
        this.LJLIL = aweme;
        this.LJLILLLLZI = context;
        this.LJLJI = C55723Ltv.LIZIZ.LJII();
        this.LJLJJI = extras.getString("event_type", "");
        this.LJLJJL = -1;
    }

    @Override // X.InterfaceC62225ObV
    public final boolean LJIIJ(AbstractC62625Ohx content, Context context, InterfaceC62573Oh7 interfaceC62573Oh7) {
        o.LJIIIZ(content, "content");
        o.LJIIIZ(context, "context");
        GZP gzp = this.LJLJI;
        Aweme aweme = this.LJLIL;
        String eventType = this.LJLJJI;
        o.LJIIIIZZ(eventType, "eventType");
        gzp.LJFF(new C41831GbL(context, aweme, eventType, null, null, 24));
        this.LJLJI.LJIIJ("share_to_story_click", this.LJLIL, new AqS176S0100000_10(this, 189));
        return true;
    }
}
