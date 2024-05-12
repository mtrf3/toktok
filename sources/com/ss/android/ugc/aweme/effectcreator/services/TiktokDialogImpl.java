package com.ss.android.ugc.aweme.effectcreator.services;

import X.AbstractC242999gF;
import X.C1DH;
import X.C238249Wq;
import X.C244659iv;
import X.C26227ARb;
import X.C38891fp;
import X.C68322mC;
import X.C6QQ;
import X.C93474aRS;
import X.C94019aaF;
import X.C94020aaG;
import X.C94226ada;
import X.C94434agw;
import X.C94554ais;
import X.C94556aiu;
import X.C94557aiv;
import X.C94558aiw;
import X.EnumC93404aQK;
import X.InterfaceC93473aRR;
import X.RunnableC93557aSn;
import X.UC0;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.dialog.IDialog;
import com.ugc.effectcreator.foundation.image.ImageLoader;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class TiktokDialogImpl implements IDialog {
    private final AbstractC242999gF createCustomBanner(Context context, List<C93474aRS> list) {
        RecyclerView recyclerView = new RecyclerView(context, null);
        recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 1));
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        C94226ada c94226ada = new C94226ada(context, list);
        recyclerView.setAdapter(c94226ada);
        c94226ada.notifyDataSetChanged();
        return new C238249Wq(recyclerView);
    }

    public final Bitmap decodeBitmap(String str, int i, int i2) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            options.inSampleSize = C38891fp.LJIIIZ(options, i, i2);
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeFile(str, options);
        } catch (Throwable unused) {
            return null;
        }
    }

    private final void showGridDialog(Context context, Drawable drawable, String str, String str2, String str3, InterfaceC93473aRR interfaceC93473aRR, String str4, List<C93474aRS> list) {
        C26227ARb c26227ARb = new C26227ARb(context);
        AbstractC242999gF accessory = createCustomBanner(context, list);
        o.LJIIIZ(accessory, "accessory");
        c26227ARb.LJIIJJI = accessory;
        c26227ARb.LJFF(str);
        c26227ARb.LIZIZ(str2);
        c26227ARb.LJII = false;
        UC0.LIZJ(c26227ARb, new C94558aiw(str3, str4, interfaceC93473aRR));
        c26227ARb.LJI().LIZLLL();
    }

    public final void showDialog(Context context, Drawable drawable, Rect rect, String str, String str2, String str3, InterfaceC93473aRR interfaceC93473aRR, String str4, int i) {
        C26227ARb c26227ARb = new C26227ARb(context);
        if (drawable != null) {
            if (i == 1) {
                c26227ARb.LJIIIZ = new C244659iv(0, context, drawable);
            } else {
                c26227ARb.LJIIIZ = new C94434agw(context, drawable, rect);
            }
        }
        c26227ARb.LJFF(str);
        c26227ARb.LIZIZ(str2);
        c26227ARb.LJII = false;
        UC0.LIZJ(c26227ARb, new C94557aiv(str3, str4, interfaceC93473aRR));
        c26227ARb.LJI().LIZLLL();
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.foundation.dialog.IDialog
    public void show(Context context, String title, String msg, String confirm, String str, InterfaceC93473aRR action, String neutral, String topImageUrl, Rect rect, List<C93474aRS> gridItems, EnumC93404aQK dialogStyle) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(title, "title");
        o.LJIIIZ(msg, "msg");
        o.LJIIIZ(confirm, "confirm");
        o.LJIIIZ(action, "action");
        o.LJIIIZ(neutral, "neutral");
        o.LJIIIZ(topImageUrl, "topImageUrl");
        o.LJIIIZ(gridItems, "gridItems");
        o.LJIIIZ(dialogStyle, "dialogStyle");
        if (!gridItems.isEmpty()) {
            showGridDialog(context, null, title, msg, confirm, action, str, gridItems);
            return;
        }
        if (topImageUrl.length() == 0) {
            C6QQ.LIZ(new C94556aiu(this, context, rect, title, msg, confirm, action, str));
            return;
        }
        C68322mC c68322mC = new C68322mC();
        if (ujb.o.LJJJLIIL(topImageUrl, "http", false)) {
            new ImageLoader().downloadImage(context, topImageUrl, new C94020aaG(new C94019aaF()), new C94554ais(context, rect, action, this, title, msg, confirm, str, c68322mC));
        } else {
            C1DH.LJJIJIIJI(new RunnableC93557aSn(this, topImageUrl, c68322mC, context, rect, title, msg, confirm, action, str));
        }
    }

    public static /* synthetic */ void showDialog$default(TiktokDialogImpl tiktokDialogImpl, Context context, Drawable drawable, Rect rect, String str, String str2, String str3, InterfaceC93473aRR interfaceC93473aRR, String str4, int i, int i2, Object obj) {
        if ((i2 & 256) != 0) {
            i = 2;
        }
        tiktokDialogImpl.showDialog(context, drawable, rect, str, str2, str3, interfaceC93473aRR, str4, i);
    }
}
