package X;

import Y.ACListenerS21S0100000_1;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.message.template.card.AwemeCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.ImageCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.imagecard.ImageCardTitleBar;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VideoCoverComponent;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageTemplateTask;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.share.improve.pkg.CommentSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.io.Serializable;
import v82.IDdS500S0100000_1;

/* renamed from: X.4JW, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4JW extends C18Z {
    public final IMContact[] LJLJI;
    public final C4JZ LJLJJI;
    public final C4JZ LJLJJL;
    public C62846OlW LJLJJLL;
    public TextView LJLJL;
    public ViewGroup LJLJLJ;
    public TextView LJLJLLL;
    public EditText LJLL;
    public TuxTextView LJLLI;
    public TuxTextView LJLLILLLL;
    public View LJLLJ;
    public final SharePackage LJLLL;
    public final Context LJLLLL;
    public final String LJLLLLLL;

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        InputMethodManager inputMethodManager = (InputMethodManager) C16880lQ.LLILL(getContext(), "input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(this.LJLL.getWindowToken(), 0);
        }
        super.cancel();
    }

    @Override // X.C18Z, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        InputMethodManager inputMethodManager = (InputMethodManager) C16880lQ.LLILL(getContext(), "input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(this.LJLL.getWindowToken(), 0);
        }
        super.dismiss();
    }

    public C4JW(C4J2 c4j2) {
        super(c4j2.LIZ, R.style.a8e);
        this.LJLLLL = c4j2.LIZ;
        this.LJLJI = c4j2.LIZIZ;
        this.LJLLL = c4j2.LIZJ;
        this.LJLJJI = c4j2.LIZLLL;
        this.LJLJJL = c4j2.LJ;
        this.LJLLLLLL = c4j2.LJFF;
    }

    @Override // X.C18Z, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setLayout(-1, -2);
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.b1f, C16880lQ.LLZIL(this.LJLLLL), null);
        this.LJLLJ = LLLZIIL;
        setContentView(LLLZIIL);
        setCancelable(false);
        this.LJLJLLL = (TextView) findViewById(R.id.jog);
        this.LJLJLJ = (ViewGroup) findViewById(R.id.mzk);
        this.LJLJJLL = (C62846OlW) findViewById(R.id.jt7);
        this.LJLJL = (TextView) findViewById(R.id.jv4);
        EditText editText = (EditText) findViewById(R.id.cp0);
        this.LJLL = editText;
        editText.setText(this.LJLLLLLL);
        EditText editText2 = this.LJLL;
        editText2.setSelection(editText2.getText().length());
        this.LJLLI = (TuxTextView) findViewById(R.id.jsv);
        this.LJLLILLLL = (TuxTextView) findViewById(R.id.jt2);
        C101073xv.LIZIZ(this.LJLLI);
        C101073xv.LIZIZ(this.LJLLILLLL);
        C16880lQ.LJJJJI(this.LJLLI, new ACListenerS21S0100000_1(this, 14));
        C16880lQ.LJJJJI(this.LJLLILLLL, new ACListenerS21S0100000_1(this, 15));
        if (TextUtils.equals("live_event", this.LJLLL.itemType)) {
            String string = this.LJLLL.extras.getString("live_event_title");
            if (!TextUtils.isEmpty(string) && this.LJLJL != null) {
                this.LJLJL.setText(EF7.LIZIZ().getResources().getString(R.string.g65, string));
                this.LJLJL.setVisibility(0);
            }
            this.LJLJJLL.setVisibility(8);
        } else if (TextUtils.equals("text", this.LJLLL.itemType)) {
            String string2 = this.LJLLL.extras.getString("share_text");
            this.LJLJL.setText(string2);
            this.LJLJJLL.setVisibility(8);
            this.LJLJL.setVisibility(0);
            if (string2 != null && string2.length() <= 1024) {
                C118824lS.LIZJ(this.LJLJL, null);
            }
        } else if (TextUtils.equals("comment", this.LJLLL.itemType)) {
            this.LJLJJLL.setVisibility(0);
            this.LJLJL.setVisibility(0);
            TextView textView = this.LJLJL;
            Context context = this.LJLLLL;
            String string3 = this.LJLLL.extras.getString("comment_author_name", "");
            String string4 = this.LJLLL.extras.getString("comment_reply_user_name", "");
            String string5 = this.LJLLL.extras.getString("comment_text", "");
            Bitmap decodeResource = BitmapFactory.decodeResource(this.LJLLLL.getResources(), R.drawable.bia);
            int LIZJ = (int) KL2.LIZJ(this.LJLLLL, 16.0f);
            int i = this.LJLLL.extras.getInt("comment_media_type", 0);
            CommentSharePackage.Companion.getClass();
            textView.setText(C119414mP.LIZ(context, string3, string4, string5, decodeResource, LIZJ, i));
            W5F LJII = W5U.LJII(C78939UyV.LJ((UrlModel) this.LJLLL.extras.getSerializable("comment_author_avatar_url")));
            LJII.LIZJ = this.LJLLLL;
            LJII.LIZIZ("ImShareDialog");
            LJII.LJIIIZ(new IDdS500S0100000_1(this, 0));
            LJIJJ(this.LJLJJLL, null, this.LJLLL, Boolean.TRUE);
        } else {
            this.LJLJJLL.setVisibility(0);
            this.LJLJL.setVisibility(8);
            LJIJJ(this.LJLJJLL, null, this.LJLLL, Boolean.TRUE);
        }
        EditText editText3 = this.LJLL;
        editText3.setFilters(new InputFilter[]{new C158066Ig(editText3)});
        this.LJLL.setOnKeyListener(new View.OnKeyListener() { // from class: X.4JX
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
                return i2 == 66;
            }
        });
        IMContact[] iMContactArr = this.LJLJI;
        if (iMContactArr == null || iMContactArr.length <= 0) {
            return;
        }
        this.LJLJLJ.removeAllViews();
        if (iMContactArr.length == 1) {
            this.LJLJLLL.setText(R.string.h99);
            this.LJLLILLLL.setText(R.string.h96);
            View LLLZIIL2 = C16880lQ.LLLZIIL(R.layout.b_5, C16880lQ.LLZIL(getContext()), null);
            W5G w5g = (W5G) LLLZIIL2.findViewById(R.id.ac_);
            TextView textView2 = (TextView) LLLZIIL2.findViewById(R.id.mzt);
            IMContact iMContact = iMContactArr[0];
            C4AS.LIZJ(w5g, iMContact.getDisplayAvatar(), "ImShareDialog:bindShareToView");
            if (iMContact instanceof IMUser) {
                textView2.setText(iMContact.getDisplayName());
                IMUser iMUser = (IMUser) iMContact;
                AJ9.LJ(getContext(), iMUser.getCustomVerify(), iMUser.getEnterpriseVerifyReason(), textView2);
            } else {
                textView2.setText(iMContact.getDisplayName());
                AJ9.LJ(getContext(), "", "", textView2);
            }
            this.LJLJLJ.addView(LLLZIIL2);
            return;
        }
        this.LJLJLLL.setText(R.string.h79);
        int length = iMContactArr.length;
        for (IMContact iMContact2 : iMContactArr) {
            View LLLZIIL3 = C16880lQ.LLLZIIL(R.layout.b_0, C16880lQ.LLZIL(getContext()), null);
            W5G w5g2 = (W5G) LLLZIIL3.findViewById(R.id.ac_);
            TuxIconView tuxIconView = (TuxIconView) LLLZIIL3.findViewById(R.id.n38);
            C4AS.LIZJ(w5g2, iMContact2.getDisplayAvatar(), "ImShareDialog:bindShareToView");
            C109564Rs.LIZ(tuxIconView, C81573Ib.LIZ(iMContact2));
            this.LJLJLJ.addView(LLLZIIL3);
        }
        TuxTextView tuxTextView = this.LJLLILLLL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append((Object) getContext().getResources().getText(R.string.h96));
        LIZ.append("(");
        LIZ.append(length);
        LIZ.append(")");
        tuxTextView.setText(X1D.LIZIZ(LIZ));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static boolean LJIJJ(C62846OlW c62846OlW, TuxIconView tuxIconView, SharePackage sharePackage, Boolean bool) {
        char c;
        int i;
        ImageCardTitleBar imageCardTitleBar;
        ImageComponent imageComponent;
        if (c62846OlW != null && sharePackage != null) {
            if (sharePackage.itemType == null) {
                C4AS.LIZJ(c62846OlW, C4AS.LJIIJ(sharePackage.extras.getString("video_cover")), "ImShareDialog:setImage");
                return false;
            }
            c62846OlW.getHierarchy().LJIJ(R.drawable.bgc);
            Serializable serializable = sharePackage.extras.getSerializable("video_cover");
            String string = sharePackage.extras.getString("thumb_url");
            Serializable serializable2 = sharePackage.extras.getSerializable("thumb_for_share");
            String str = sharePackage.itemType;
            str.getClass();
            int i2 = -1;
            switch (str.hashCode()) {
                case -2091181238:
                    if (str.equals("paid_series")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1902319008:
                    if (str.equals("set_sticker")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1890252483:
                    if (str.equals("sticker")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1533934094:
                    if (str.equals("now_bonus_invite")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1443288204:
                    if (str.equals("image_card")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -1354494072:
                    if (str.equals("aweme_card")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -1106844940:
                    if (str.equals("aigc_avatar")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -1103912169:
                    if (str.equals("now_others_video_post")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case -913038159:
                    if (str.equals("story_video")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case -906336856:
                    if (str.equals("search")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case -439827310:
                    if (str.equals("now_invite")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case -309474065:
                    if (str.equals("product")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case -173657445:
                    if (str.equals("mix_videos")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case -84391837:
                    if (str.equals("point_of_interest")) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case -2348590:
                    if (str.equals("now_video")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case 102340:
                    if (str.equals("gif")) {
                        c = 15;
                        break;
                    }
                    c = 65535;
                    break;
                case 112100:
                    if (str.equals("qna")) {
                        c = 16;
                        break;
                    }
                    c = 65535;
                    break;
                case 117588:
                    if (str.equals("web")) {
                        c = 17;
                        break;
                    }
                    c = 65535;
                    break;
                case 3165170:
                    if (str.equals("game")) {
                        c = 18;
                        break;
                    }
                    c = 65535;
                    break;
                case 3322092:
                    if (str.equals("live")) {
                        c = 19;
                        break;
                    }
                    c = 65535;
                    break;
                case 3599307:
                    if (str.equals("user")) {
                        c = 20;
                        break;
                    }
                    c = 65535;
                    break;
                case 93227207:
                    if (str.equals("aweme")) {
                        c = 21;
                        break;
                    }
                    c = 65535;
                    break;
                case 98629247:
                    if (str.equals("group")) {
                        c = 22;
                        break;
                    }
                    c = 65535;
                    break;
                case 104263205:
                    if (str.equals("music")) {
                        c = 23;
                        break;
                    }
                    c = 65535;
                    break;
                case 105172251:
                    if (str.equals("nudge")) {
                        c = 24;
                        break;
                    }
                    c = 65535;
                    break;
                case 136452473:
                    if (str.equals("video_sticker")) {
                        c = 25;
                        break;
                    }
                    c = 65535;
                    break;
                case 361630739:
                    if (str.equals("now_others_post")) {
                        c = 26;
                        break;
                    }
                    c = 65535;
                    break;
                case 950398559:
                    if (str.equals("comment")) {
                        c = 27;
                        break;
                    }
                    c = 65535;
                    break;
                case 972568762:
                    if (str.equals("aweme_photo")) {
                        c = 28;
                        break;
                    }
                    c = 65535;
                    break;
                case 1402633315:
                    if (str.equals("challenge")) {
                        c = 29;
                        break;
                    }
                    c = 65535;
                    break;
                case 1499875791:
                    if (str.equals("subscribe_link")) {
                        c = 30;
                        break;
                    }
                    c = 65535;
                    break;
                case 1662194627:
                    if (str.equals("now_link")) {
                        c = 31;
                        break;
                    }
                    c = 65535;
                    break;
                case 1662319721:
                    if (str.equals("now_post")) {
                        c = ' ';
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            String str2 = "";
            switch (c) {
                case 0:
                    C4AS.LIZJ(c62846OlW, C4AS.LJIIJ(string), "ImShareDialog:paid_series");
                    return true;
                case 1:
                case 25:
                    SendMessageTemplateTask sendMessageTemplateTask = sharePackage.sendMessageTemplateTask;
                    if (sendMessageTemplateTask != null) {
                        if (sharePackage.itemType.equals("set_sticker")) {
                            str2 = "ImShareDialog:SetSticker";
                        } else if (sharePackage.itemType.equals("video_sticker")) {
                            str2 = "ImShareDialog:videoSticker";
                        }
                        UrlModel LJJIIJ = C78934UyQ.LJJIIJ(((StickerTemplate) sendMessageTemplateTask.template).imageComponent.urls);
                        if (C4JY.LIZ()) {
                            C4AS.LIZIZ(c62846OlW, LJJIIJ, str2, 0, 0, 0, 0, null, 504);
                        } else {
                            C4AS.LIZJ(c62846OlW, LJJIIJ, str2);
                        }
                    }
                    return true;
                case 2:
                    if (serializable instanceof UrlModel) {
                        C4AS.LIZJ(c62846OlW, (UrlModel) serializable, "ImShareDialog:setImage");
                    } else {
                        C78765Uvh.LIZ(c62846OlW, R.drawable.bjz);
                    }
                    return true;
                case 3:
                case 7:
                case '\n':
                case 14:
                case 26:
                case ' ':
                    if (!TextUtils.isEmpty(string)) {
                        C4AS.LIZJ(c62846OlW, C4AS.LJIIJ(string), sharePackage.itemType);
                    } else {
                        SendMessageTemplateTask sendMessageTemplateTask2 = sharePackage.sendMessageTemplateTask;
                        if (sendMessageTemplateTask2 != null && (imageCardTitleBar = ((ImageCardTemplate) sendMessageTemplateTask2.template).titleBar) != null && (imageComponent = imageCardTitleBar.leftImage) != null) {
                            C4AS.LIZJ(c62846OlW, C78934UyQ.LJJIIJ(imageComponent.urls), sharePackage.itemType);
                        }
                    }
                    return true;
                case 4:
                case 30:
                    SendMessageTemplateTask sendMessageTemplateTask3 = sharePackage.sendMessageTemplateTask;
                    if (sendMessageTemplateTask3 != null) {
                        ImageCardTemplate imageCardTemplate = (ImageCardTemplate) sendMessageTemplateTask3.template;
                        if (bool.booleanValue()) {
                            C2068389v c2068389v = new C2068389v();
                            c2068389v.LIZ = C107304Ja.LIZIZ(sendMessageTemplateTask3.scene, false);
                            c2068389v.LIZIZ = C17N.LJIILL(64.0d);
                            c2068389v.LIZJ = C17N.LJIILL(64.0d);
                            c2068389v.LJ = Integer.valueOf(R.attr.gv);
                            SY9 LIZ = c2068389v.LIZ(c62846OlW.getContext());
                            C07810Sj.LJ(LIZ, true);
                            c62846OlW.setImageDrawable(LIZ);
                            c62846OlW.setBackgroundColor(AnonymousClass636.LJIIIIZZ(R.attr.cf, c62846OlW.getContext()));
                            c62846OlW.setScaleType(ImageView.ScaleType.CENTER);
                        } else if (imageCardTemplate.videoCoversComponentList.size() > 0) {
                            C4AS.LIZJ(c62846OlW, C78934UyQ.LJJIIJ(((VideoCoverComponent) ListProtector.get(imageCardTemplate.videoCoversComponentList, 0)).coverImage.urls), "ImShareDialog:ImageCard");
                        }
                    }
                    return true;
                case 5:
                    SendMessageTemplateTask sendMessageTemplateTask4 = sharePackage.sendMessageTemplateTask;
                    if (sendMessageTemplateTask4 != null) {
                        BaseTemplate baseTemplate = sendMessageTemplateTask4.template;
                        if (baseTemplate instanceof AwemeCardTemplate) {
                            C4AS.LIZJ(c62846OlW, C78934UyQ.LJJIIJ(((AwemeCardTemplate) baseTemplate).baseVideoComponent.coverImage.urls), "ImShareDialog:AwemeCard");
                        }
                    }
                    return true;
                case 6:
                    String string2 = sharePackage.extras.getString("uncrop_avatar_path", "");
                    if (!string2.isEmpty()) {
                        c62846OlW.setImageURI(android.net.Uri.fromFile(new File(string2)));
                    } else {
                        C4AS.LIZJ(c62846OlW, C4AS.LJIIJ(sharePackage.extras.getString("image_url", "")), "ImShareDialog:aigc_profile");
                    }
                    return true;
                case '\b':
                case 21:
                case 28:
                    if (serializable instanceof UrlModel) {
                        C4AS.LIZJ(c62846OlW, (UrlModel) serializable, "ImShareDialog:setImage");
                    } else {
                        C78765Uvh.LIZ(c62846OlW, R.attr.cv);
                    }
                    return true;
                case '\t':
                case 17:
                    if (!TextUtils.isEmpty(string)) {
                        C4AS.LIZJ(c62846OlW, C4AS.LJIIJ(string), "ImShareDialog:web");
                    } else {
                        C78765Uvh.LIZ(c62846OlW, R.drawable.bk0);
                    }
                    return true;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    C4AS.LIZJ(c62846OlW, (UrlModel) sharePackage.extras.getSerializable("product_picture"), "ImShareDialog:product");
                    return true;
                case '\f':
                    if (bool.booleanValue()) {
                        C2068389v c2068389v2 = new C2068389v();
                        c2068389v2.LIZ = R.raw.icon_2pt_playlist;
                        c2068389v2.LIZIZ = C17N.LJIILL(64.0d);
                        c2068389v2.LIZJ = C17N.LJIILL(64.0d);
                        c2068389v2.LJ = Integer.valueOf(R.attr.gv);
                        SY9 LIZ2 = c2068389v2.LIZ(c62846OlW.getContext());
                        C07810Sj.LJ(LIZ2, true);
                        c62846OlW.setImageDrawable(LIZ2);
                        c62846OlW.setBackgroundColor(AnonymousClass636.LJIIIIZZ(R.attr.cf, c62846OlW.getContext()));
                        c62846OlW.setScaleType(ImageView.ScaleType.CENTER);
                    } else {
                        if (tuxIconView != null) {
                            tuxIconView.setVisibility(0);
                        }
                        if (serializable instanceof UrlModel) {
                            C4AS.LIZJ(c62846OlW, (UrlModel) serializable, "ImShareDialog:compilation");
                        }
                    }
                    return true;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                    C2068389v c2068389v3 = new C2068389v();
                    c2068389v3.LIZ = R.raw.icon_2pt_map_pin;
                    c2068389v3.LIZIZ = C17N.LJIILL(24.0d);
                    c2068389v3.LIZJ = C17N.LJIILL(24.0d);
                    c2068389v3.LJ = Integer.valueOf(R.attr.gv);
                    SY9 LIZ3 = c2068389v3.LIZ(c62846OlW.getContext());
                    C07810Sj.LJ(LIZ3, true);
                    c62846OlW.setImageDrawable(LIZ3);
                    c62846OlW.setBackgroundColor(AnonymousClass636.LJIIIIZZ(R.attr.cf, c62846OlW.getContext()));
                    c62846OlW.setScaleType(ImageView.ScaleType.CENTER);
                    return true;
                case 15:
                    if (serializable instanceof UrlModel) {
                        if (C4JY.LIZ()) {
                            C4AS.LIZ(c62846OlW, (UrlModel) serializable, "ImShareDialog:gif", 0, 0, 0, false, 1, null);
                        } else {
                            C4AS.LIZJ(c62846OlW, (UrlModel) serializable, "ImShareDialog:gif");
                        }
                    }
                    return true;
                case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                    if (bool.booleanValue()) {
                        C2068389v c2068389v4 = new C2068389v();
                        c2068389v4.LIZ = R.raw.icon_2pt_qa_ltr;
                        c2068389v4.LIZIZ = C17N.LJIILL(64.0d);
                        c2068389v4.LIZJ = C17N.LJIILL(64.0d);
                        c2068389v4.LJ = Integer.valueOf(R.attr.gv);
                        SY9 LIZ4 = c2068389v4.LIZ(c62846OlW.getContext());
                        C07810Sj.LJ(LIZ4, true);
                        c62846OlW.setImageDrawable(LIZ4);
                        c62846OlW.setBackgroundColor(AnonymousClass636.LJIIIIZZ(R.attr.cf, c62846OlW.getContext()));
                        c62846OlW.setScaleType(ImageView.ScaleType.CENTER);
                    } else {
                        C2068389v c2068389v5 = new C2068389v();
                        c2068389v5.LIZ = R.raw.icon_qa_ltr;
                        c2068389v5.LJ = Integer.valueOf(R.attr.gv);
                        c2068389v5.LIZIZ = C17N.LJIILL(20.0d);
                        c2068389v5.LIZJ = C17N.LJIILL(20.0d);
                        SY9 LIZ5 = c2068389v5.LIZ(c62846OlW.getContext());
                        C07810Sj.LJ(LIZ5, true);
                        c62846OlW.setImageDrawable(LIZ5);
                        c62846OlW.setBackground(C04270Et.LIZIZ(c62846OlW.getContext(), R.drawable.bji));
                        c62846OlW.setScaleType(ImageView.ScaleType.CENTER);
                    }
                    return true;
                case 18:
                    if (!TextUtils.isEmpty(string)) {
                        C4AS.LIZJ(c62846OlW, C4AS.LJIIJ(string), "ImShareDialog:game");
                    } else {
                        String string3 = sharePackage.extras.getString("is_game");
                        if (!TextUtils.isEmpty(string3)) {
                            if (Boolean.valueOf(string3).booleanValue()) {
                                i = R.drawable.bjt;
                            } else {
                                i = R.drawable.bjs;
                            }
                            C78765Uvh.LIZ(c62846OlW, i);
                        }
                    }
                    return true;
                case 19:
                    if (serializable instanceof UrlModel) {
                        C4AS.LIZJ(c62846OlW, (UrlModel) serializable, "ImShareDialog:live");
                    } else if (serializable2 != null && (serializable2 instanceof UrlModel)) {
                        C4AS.LIZJ(c62846OlW, (UrlModel) serializable2, "ImShareDialog:live");
                    } else {
                        C78765Uvh.LIZ(c62846OlW, R.drawable.bjr);
                    }
                    return true;
                case 20:
                    c62846OlW.getLayoutParams().height = (int) KL2.LIZJ(c62846OlW.getContext(), 56.0f);
                    c62846OlW.getLayoutParams().width = (int) KL2.LIZJ(c62846OlW.getContext(), 56.0f);
                    V8L v8l = c62846OlW.getHierarchy().LIZJ;
                    if (v8l != null) {
                        v8l.LIZIZ = true;
                        c62846OlW.getHierarchy().LJIL(v8l);
                    }
                    if (serializable instanceof UrlModel) {
                        C4AS.LIZJ(c62846OlW, (UrlModel) serializable, "ImShareDialog:user");
                    }
                    return true;
                case 22:
                    c62846OlW.getLayoutParams().height = (int) KL2.LIZJ(c62846OlW.getContext(), 42.0f);
                    c62846OlW.getLayoutParams().width = (int) KL2.LIZJ(c62846OlW.getContext(), 42.0f);
                    if (serializable instanceof UrlModel) {
                        C45S.LIZJ(c62846OlW, (UrlModel) serializable, "ImShareDialog:setImage");
                    } else {
                        C78765Uvh.LIZ(c62846OlW, R.drawable.big);
                    }
                    return true;
                case 23:
                    if (serializable instanceof UrlModel) {
                        C4AS.LIZJ(c62846OlW, (UrlModel) serializable, "ImShareDialog:music");
                    } else {
                        String string4 = sharePackage.extras.getString("cover_thumb");
                        if (!TextUtils.isEmpty(string4)) {
                            C4AS.LIZJ(c62846OlW, C4AS.LJIIJ(string4), "ImShareDialog:music");
                        }
                    }
                    return true;
                case 24:
                    if (serializable instanceof UrlModel) {
                        if (C4JY.LIZ()) {
                            C4AS.LIZ(c62846OlW, (UrlModel) serializable, "ImShareDialog:nudge", 0, 0, 1, false, 1, null);
                        } else {
                            C4AS.LIZJ(c62846OlW, (UrlModel) serializable, "ImShareDialog:nudge");
                        }
                        if (!sharePackage.extras.getBoolean("is_receive")) {
                            c62846OlW.setScaleX(-1.0f);
                        }
                        float scaleX = c62846OlW.getScaleX();
                        if (C4FU.LJ()) {
                            i2 = 1;
                        }
                        c62846OlW.setScaleX(scaleX * i2);
                    }
                    return true;
                case 27:
                    C4AS.LIZJ(c62846OlW, (UrlModel) sharePackage.extras.getSerializable("video_cover"), "ImShareDialog:comment");
                    return true;
                case 29:
                    c62846OlW.setImageResource(R.drawable.bi8);
                    c62846OlW.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    return true;
                case 31:
                    if (!TextUtils.isEmpty(string)) {
                        C4AS.LIZJ(c62846OlW, C4AS.LJIIJ(string), sharePackage.itemType);
                    }
                    return true;
                default:
                    if (serializable instanceof UrlModel) {
                        C4AS.LIZJ(c62846OlW, (UrlModel) serializable, "ImShareDialog:default");
                        return true;
                    }
                    break;
            }
        }
        return false;
    }
}
