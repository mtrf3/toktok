package com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.assem;

import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.C03880Dg;
import X.C16880lQ;
import X.C212428Vi;
import X.C213688a4;
import X.C214298b3;
import X.C36576EXc;
import X.C39519Ff9;
import X.C65300Pk0;
import X.C65352Pkq;
import X.C65776Prg;
import X.C71531S5n;
import X.C78926UyI;
import X.C79045V0n;
import X.C8VV;
import X.C8YN;
import X.C9BD;
import X.I2Y;
import X.S6D;
import X.S9C;
import X.S9D;
import X.S9E;
import X.SY4;
import X.TBT;
import X.XKX;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.BillboardGlobalViewModel;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.ImageListViewModel;
import com.ss.android.ugc.aweme.tools.live.sticker.StickerViewServiceImpl;
import com.ss.android.ugc.aweme.utils.Au2S20S0100000_12;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS194S0100000_12;
import ujb.o;

/* loaded from: classes13.dex */
public final class BillboardImagesAssem extends UIContentAssem implements I2Y {
    public final C214298b3 LJLIL;
    public final C214298b3 LJLILLLLZI;
    public LayoutInflater LJLJI;
    public View LJLJJI;
    public AqS178S0100000_12 LJLJJL;
    public AqS178S0100000_12 LJLJJLL;
    public final Map<Integer, View> LJLJL = new LinkedHashMap();

    @Override // X.I2Y
    public final void LJJJJLI(List<String> list) {
    }

    @Override // X.I2Y
    public final void LJJLIIIJL(String str, String str2) {
    }

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public BillboardImagesAssem() {
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ImageListViewModel.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9bd, new AqS162S0100000_12(LIZ, 638), S9C.INSTANCE, null);
        C65776Prg LIZ2 = C65352Pkq.LIZ(BillboardGlobalViewModel.class);
        this.LJLILLLLZI = C78926UyI.LJ(this, LIZ2, c9bd, new AqS162S0100000_12(LIZ2, 639), S9D.INSTANCE, null);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        StickerViewServiceImpl.createIStickerViewServicebyMonsterPlugin(false).removeScanPhotoListListener(this);
    }

    @Override // X.I2Y
    public final void LJIIZILJ(String str) {
        Cursor query;
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            return;
        }
        if (o.LJJJLIIL(str2, "content://", false)) {
            ContentResolver contentResolver = getContainerView().getContext().getContentResolver();
            kotlin.jvm.internal.o.LJIIIIZZ(contentResolver, "containerView.context.contentResolver");
            Uri parse = UriProtector.parse(str2);
            kotlin.jvm.internal.o.LJIIIIZZ(parse, "parse(photoPath)");
            C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(240004, "android/content/ContentResolver", "query", contentResolver, new Object[]{parse, null, null, null, null}, "android.database.Cursor", new C65300Pk0(false, "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "6169387107305217319"));
            if (LIZJ.LIZ) {
                query = (Cursor) LIZJ.LIZIZ;
            } else {
                query = contentResolver.query(parse, null, null, null, null);
            }
            if (query == null) {
                str2 = String.valueOf(parse.getPath());
            } else {
                query.moveToFirst();
                str2 = query.getString(query.getColumnIndex("_data"));
                kotlin.jvm.internal.o.LJIIIIZZ(str2, "cursor.getString(idx)");
                query.close();
            }
        }
        ImageListViewModel imageListViewModel = (ImageListViewModel) this.LJLIL.getValue();
        imageListViewModel.setState(S6D.LJLIL);
        imageListViewModel.LJLJL = XKX.LIZLLL(ViewModelKt.getViewModelScope(imageListViewModel), C36576EXc.LIZIZ, null, new C71531S5n(imageListViewModel, str2, null), 2);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Integer LJI;
        kotlin.jvm.internal.o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        Context context = getContext();
        if (context != null) {
            if (AnonymousClass636.LJIILJJIL(context)) {
                LJI = C79045V0n.LJI(R.attr.cr, context);
            } else {
                LJI = C79045V0n.LJI(R.attr.c9, context);
            }
            if (LJI != null) {
                _$_findCachedViewById(R.id.g0k).setBackgroundColor(LJI.intValue());
            }
        }
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ == null) {
            return;
        }
        StickerViewServiceImpl.createIStickerViewServicebyMonsterPlugin(false).initGalleryModule(LIZ, this);
        this.LJLJI = C16880lQ.LLZIL(view.getContext());
        C8VV.LIZJ(this, new AqS178S0100000_12(this, 214));
        _$_findCachedViewById(R.id.auh).getClass();
        ((SY4) _$_findCachedViewById(R.id.auh)).setButtonVariant(5);
        AqS178S0100000_12 aqS178S0100000_12 = new AqS178S0100000_12(this, 215);
        this.LJLJJL = aqS178S0100000_12;
        View btnUpload = _$_findCachedViewById(R.id.auh);
        kotlin.jvm.internal.o.LJIIIIZZ(btnUpload, "btnUpload");
        C16880lQ.LJIIJ(new Au2S20S0100000_12(aqS178S0100000_12, 38, 42), btnUpload);
        C8YN.LJII(this, (AssemViewModel) this.LJLIL.getValue(), new TBT() { // from class: X.S6J
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((S6F) obj).LJLILLLLZI;
            }
        }, null, new AqS194S0100000_12(this, 175), 6);
        ((AssemViewModel) this.LJLIL.getValue()).asyncSubscribe(new TBT() { // from class: X.S6H
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((S6F) obj).LJLIL;
            }
        }, C213688a4.LIZJ(), this, new AqS178S0100000_12(this, 357), new AqS162S0100000_12(this, 1012), new AqS178S0100000_12(this, 358));
        ((AssemViewModel) this.LJLIL.getValue()).asyncSubscribe(new TBT() { // from class: X.S6P
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((S6F) obj).LJLJJLL;
            }
        }, C213688a4.LIZJ(), this, new AqS178S0100000_12(this, 359), S9E.LJLIL, new AqS178S0100000_12(this, 356));
    }
}
