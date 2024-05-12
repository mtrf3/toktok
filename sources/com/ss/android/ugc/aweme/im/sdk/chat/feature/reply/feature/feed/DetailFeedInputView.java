package com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed;

import X.C105134Ar;
import X.C105454Bx;
import X.C105784De;
import X.C111024Xi;
import X.C16880lQ;
import X.C32151Nz;
import X.C34B;
import X.C3EU;
import X.C3Y4;
import X.C4BS;
import X.C4BT;
import X.C4LS;
import X.C4YG;
import X.C62846OlW;
import X.C76800UCe;
import X.C78765Uvh;
import X.C78939UyV;
import X.C80533Eb;
import X.C87687YbD;
import X.C98063t4;
import X.InterfaceC65784Pro;
import X.InterfaceC92953kp;
import X.J7H;
import X.O6R;
import X.W5F;
import X.W5U;
import X.X1D;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStub;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.DetailFeedInputView;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import kotlin.jvm.internal.AqS65S0201000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class DetailFeedInputView extends BaseInputView {
    public final Bundle LJLLLLLL;
    public final LifecycleOwner LJLZ;
    public View LJZ;
    public SmartImageView LJZI;
    public TuxTextView LJZL;
    public ViewStub LL;
    public View LLD;
    public boolean LLF;
    public String LLFF;
    public boolean LLFFF;
    public DetailFeedKeyboardDialogFragment LLFII;
    public InterfaceC65784Pro<C76800UCe> LLFZ;
    public String LLI;

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView
    public final C4BS LIZLLL(C4BS c4bs) {
        return c4bs;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView, X.InterfaceC105124Aq
    public final void LLLZLZ(C105454Bx baseEmoji) {
        o.LJIIIZ(baseEmoji, "baseEmoji");
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView, X.InterfaceC105124Aq
    public final void onDestroy() {
        this.LLFFF = true;
        super.onDestroy();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView, X.InterfaceC105124Aq
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public /* bridge */ /* synthetic */ void onPause() {
        C105134Ar.LIZIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView, X.InterfaceC105124Aq
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public /* bridge */ /* synthetic */ void onResume() {
        C105134Ar.LIZJ(this);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView, X.InterfaceC105124Aq
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public /* bridge */ /* synthetic */ void onStop() {
        C105134Ar.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView
    public final void LJIIIIZZ() {
        String str = this.LLI;
        if (str != null) {
            C98063t4.LIZIZ(str);
        } else {
            o.LJIJI("enterFromAnalyticParam");
            throw null;
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView
    public final void LJIIJ() {
        String str = this.LLI;
        if (str != null) {
            C98063t4.LIZJ(str, null, null, 14);
        } else {
            o.LJIJI("enterFromAnalyticParam");
            throw null;
        }
    }

    @Override // X.InterfaceC105124Aq
    public final void vb() {
        String str;
        Editable text;
        String str2 = this.LLI;
        if (str2 != null) {
            C3Y4.LJ("enter_from", str2);
            C4YG c4yg = this.LJLILLLLZI;
            if (c4yg == null || (text = c4yg.getText()) == null || (str = text.toString()) == null) {
                str = "";
            }
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LLFZ;
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
            }
            n9();
            DetailFeedKeyboardDialogFragment detailFeedKeyboardDialogFragment = this.LLFII;
            if (detailFeedKeyboardDialogFragment != null) {
                detailFeedKeyboardDialogFragment.Il(new AqS65S0201000_1(detailFeedKeyboardDialogFragment, 4, str, 3));
                return;
            }
            return;
        }
        o.LJIJI("enterFromAnalyticParam");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
    
        if (r3 != null) goto L9;
     */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(androidx.lifecycle.LifecycleOwner r6) {
        /*
            r5 = this;
            java.lang.String r0 = "lifecycleOwner"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            X.4BT r0 = r5.LJLJL
            r4 = 0
            if (r0 == 0) goto L58
            X.4BS r3 = new X.4BS
            r3.<init>(r5, r0, r6)
        Lf:
            X.C4VN.LIZ()
            r2 = 1
            boolean r0 = X.C110154Tz.LIZ(r2)
            if (r0 == 0) goto L53
            if (r3 == 0) goto L56
            X.4Br r0 = r3.LJ
            r0.LIZIZ = r2
        L1f:
            X.4Br r0 = r3.LJ
            r0.LJI = r2
            android.os.Bundle r1 = r5.LJLLLLLL
            if (r1 == 0) goto L2d
            java.lang.String r0 = "showEmojiTab"
            boolean r2 = r1.getBoolean(r0)
        L2d:
            X.4Br r0 = r3.LJ
            r0.LJFF = r2
            X.4BU r0 = r3.LIZ()
        L35:
            r5.LJLJLLL = r0
            if (r0 == 0) goto L40
            android.widget.ImageView r0 = r0.LJII()
            X.C16880lQ.LJIILLIIL(r0, r5)
        L40:
            X.4BT r1 = r5.LJLJL
            if (r1 == 0) goto L52
            X.4BU r0 = r5.LJLJLLL
            if (r0 == 0) goto L4a
            android.view.View r4 = r0.LJLIL
        L4a:
            r1.LIZ(r4)
            X.4YG r0 = r5.LJLILLLLZI
            r1.setEditText(r0)
        L52:
            return
        L53:
            if (r3 == 0) goto L56
            goto L1f
        L56:
            r0 = r4
            goto L35
        L58:
            r3 = r4
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.DetailFeedInputView.LJFF(androidx.lifecycle.LifecycleOwner):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJI(boolean r6) {
        /*
            r5 = this;
            android.view.View r4 = r5.LJLJJI
            if (r4 == 0) goto L42
            boolean r3 = r4.isActivated()
            r4.setActivated(r6)
            r4.setEnabled(r6)
            android.content.Context r1 = r5.getContext()
            if (r1 == 0) goto L4b
            if (r6 == 0) goto L47
            r0 = 2130968670(0x7f04005e, float:1.7546E38)
        L19:
            java.lang.Integer r0 = X.C79045V0n.LJI(r0, r1)
            if (r0 == 0) goto L4b
            int r2 = r0.intValue()
        L23:
            if (r6 == 0) goto L43
            r1 = 2130968641(0x7f040041, float:1.7545941E38)
        L28:
            android.graphics.drawable.Drawable r0 = r4.getBackground()
            r0.setTint(r2)
            boolean r0 = r4 instanceof com.bytedance.tux.icon.TuxIconView
            if (r0 == 0) goto L3b
            r0 = r4
            com.bytedance.tux.icon.TuxIconView r0 = (com.bytedance.tux.icon.TuxIconView) r0
            if (r0 == 0) goto L3b
            r0.setTintColorRes(r1)
        L3b:
            if (r6 == 0) goto L42
            if (r3 != 0) goto L42
            X.C105624Co.LIZ(r4)
        L42:
            return
        L43:
            r1 = 2130968612(0x7f040024, float:1.7545883E38)
            goto L28
        L47:
            r0 = 2130968931(0x7f040163, float:1.754653E38)
            goto L19
        L4b:
            r2 = 0
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.DetailFeedInputView.LJIJI(boolean):void");
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i;
        boolean z;
        String valueOf = String.valueOf(editable);
        int length = valueOf.length() - 1;
        int i2 = 0;
        boolean z2 = false;
        while (i2 <= length) {
            if (!z2) {
                i = i2;
            } else {
                i = length;
            }
            if (o.LJIIJJI(valueOf.charAt(i), 32) <= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z2) {
                if (!z) {
                    z2 = true;
                } else {
                    i2++;
                }
            } else if (!z) {
                break;
            } else {
                length--;
            }
        }
        if (TextUtils.isEmpty(valueOf.subSequence(i2, length + 1).toString())) {
            LJIJI(false);
            C4YG c4yg = this.LJLILLLLZI;
            if (c4yg != null) {
                c4yg.setMaxLines(1);
            }
            C4YG c4yg2 = this.LJLILLLLZI;
            if (c4yg2 != null) {
                c4yg2.setHint(this.LLFF);
            }
            this.LLF = true;
            return;
        }
        LJIJI(true);
        if (!this.LLF) {
            return;
        }
        C4YG c4yg3 = this.LJLILLLLZI;
        if (c4yg3 != null) {
            c4yg3.setMaxLines(5);
        }
        C4YG c4yg4 = this.LJLILLLLZI;
        if (c4yg4 != null) {
            c4yg4.setHint("");
        }
        this.LLF = false;
    }

    public DetailFeedInputView(C111024Xi c111024Xi, Bundle bundle, LifecycleOwner lifecycleOwner) {
        super(lifecycleOwner);
        boolean z;
        boolean z2;
        Aweme aweme;
        String nickname;
        UrlModel cover;
        User user;
        boolean z3;
        Aweme aweme2;
        Video video;
        Resources resources;
        Configuration configuration;
        C4YG c4yg;
        TuxIconView tuxIconView;
        this.LJLLLLLL = bundle;
        this.LJLZ = lifecycleOwner;
        this.LLF = true;
        String str = "";
        this.LLFF = "";
        this.LJLILLLLZI = (C4YG) c111024Xi.findViewById(R.id.gnm);
        this.LJLJJLL = c111024Xi.findViewById(R.id.cow);
        this.LJLJI = (TuxIconView) c111024Xi.findViewById(R.id.cu2);
        if (C4LS.LIZ() && (tuxIconView = this.LJLJI) != null) {
            tuxIconView.setVisibility(8);
        }
        this.LJLJJI = c111024Xi.findViewById(R.id.jo1);
        this.LJLJL = (C4BT) c111024Xi.findViewById(R.id.hho);
        View findViewById = c111024Xi.findViewById(R.id.n7g);
        o.LJIIIIZZ(findViewById, "inputLayout.findViewById(R.id.video_ref_layout)");
        this.LJZ = findViewById;
        View findViewById2 = findViewById.findViewById(R.id.n93);
        o.LJIIIIZZ(findViewById2, "feedReplyLayout.findViewById(R.id.video_thumbnail)");
        this.LJZI = (SmartImageView) findViewById2;
        View view = this.LJZ;
        UrlModel urlModel = null;
        if (view != null) {
            View findViewById3 = view.findViewById(R.id.n7i);
            o.LJIIIIZZ(findViewById3, "feedReplyLayout.findView…Id(R.id.video_reply_text)");
            this.LJZL = (TuxTextView) findViewById3;
            this.LL = (ViewStub) c111024Xi.findViewById(R.id.jvu);
            LJFF(lifecycleOwner);
            C4BT c4bt = this.LJLJL;
            if (c4bt != null) {
                c4bt.setFixKeyboardHeight(true);
            }
            super.LJII(c111024Xi);
            super.LJI();
            Context context = getContext();
            if (context != null && (resources = context.getResources()) != null && (configuration = resources.getConfiguration()) != null && configuration.orientation == 2 && (c4yg = this.LJLILLLLZI) != null) {
                c4yg.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: X.4BQ
                    @Override // android.widget.TextView.OnEditorActionListener
                    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                        if (i != 6) {
                            return false;
                        }
                        Object LLILL = C16880lQ.LLILL(textView.getContext(), "input_method");
                        o.LJII(LLILL, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                        InputMethodManager inputMethodManager = (InputMethodManager) LLILL;
                        if (inputMethodManager.isActive()) {
                            inputMethodManager.hideSoftInputFromWindow(textView.getApplicationWindowToken(), 0);
                            return true;
                        }
                        return true;
                    }
                });
            }
            if (bundle != null) {
                String string = bundle.getString("enterFrom", "chat_video_detail");
                o.LJIIIIZZ(string, "it.getString(ARG_ENTER_FROM, CHAT_VIDEO_DETAIL)");
                this.LLI = string;
                CharSequence charSequence = bundle.getCharSequence("hint");
                if (charSequence != null) {
                    this.LLFF = charSequence.toString();
                }
                if (bundle.getBoolean("showEmojiPanel")) {
                    LJIILLIIL(1);
                    TuxIconView tuxIconView2 = this.LJLJI;
                    if (tuxIconView2 != null) {
                        tuxIconView2.setSelected(true);
                    }
                    z = true;
                } else {
                    LJIILLIIL(-2);
                    TuxIconView tuxIconView3 = this.LJLJI;
                    if (tuxIconView3 != null) {
                        tuxIconView3.setSelected(false);
                    }
                    C4YG c4yg2 = this.LJLILLLLZI;
                    if (c4yg2 != null) {
                        c4yg2.requestFocus();
                    }
                    z = false;
                }
                LJIJ(z);
                String string2 = bundle.getString("style");
                if (string2 == null || string2.hashCode() != 492395368 || !string2.equals("reply_sharer")) {
                    long j = bundle.getLong("shareUserId", -1L);
                    String string3 = bundle.getString("shareMessageSecUserId", "");
                    if (o.LJ(bundle.getString("video_from"), "from_chat") || o.LJ(bundle.getString("video_from"), "from_auto_message")) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    Serializable serializable = bundle.getSerializable("video");
                    if ((serializable instanceof Aweme) && (aweme = (Aweme) serializable) != null) {
                        if (z2) {
                            C80533Eb.LJIIJJI(String.valueOf(j), string3, false, new C3EU() { // from class: X.4BO
                                @Override // X.C3EU
                                public final void LIZ(IMUser result) {
                                    String nickName;
                                    String string4;
                                    Context context2;
                                    o.LJIIIZ(result, "result");
                                    DetailFeedInputView detailFeedInputView = DetailFeedInputView.this;
                                    if (detailFeedInputView.LLFFF) {
                                        return;
                                    }
                                    detailFeedInputView.getClass();
                                    String str2 = "";
                                    if (!C36L.LIZJ(result) ? (nickName = result.getNickName()) == null : !((context2 = detailFeedInputView.getContext()) != null && (nickName = context2.getString(R.string.h8_)) != null)) {
                                        nickName = "";
                                    }
                                    DetailFeedInputView detailFeedInputView2 = DetailFeedInputView.this;
                                    TuxTextView tuxTextView = detailFeedInputView2.LJZL;
                                    if (tuxTextView != null) {
                                        Context context3 = detailFeedInputView2.getContext();
                                        if (context3 != null && (string4 = context3.getString(R.string.gzj, nickName)) != null) {
                                            str2 = string4;
                                        }
                                        tuxTextView.setText(str2);
                                        return;
                                    }
                                    o.LJIJI("feedReplyText");
                                    throw null;
                                }

                                @Override // X.C3EU
                                public final void LIZIZ(Throwable throwable) {
                                    String string4;
                                    o.LJIIIZ(throwable, "throwable");
                                    DetailFeedInputView detailFeedInputView = DetailFeedInputView.this;
                                    if (detailFeedInputView.LLFFF) {
                                        return;
                                    }
                                    TuxTextView tuxTextView = detailFeedInputView.LJZL;
                                    if (tuxTextView != null) {
                                        Context context2 = detailFeedInputView.getContext();
                                        String str2 = "";
                                        if (context2 != null && (string4 = context2.getString(R.string.gzj, "")) != null) {
                                            str2 = string4;
                                        }
                                        tuxTextView.setText(str2);
                                        return;
                                    }
                                    o.LJIJI("feedReplyText");
                                    throw null;
                                }
                            });
                        } else {
                            TuxTextView tuxTextView = this.LJZL;
                            if (tuxTextView != null) {
                                Context context2 = getContext();
                                if (context2 != null) {
                                    Object[] objArr = new Object[1];
                                    User author = aweme.getAuthor();
                                    objArr[0] = (author == null || (nickname = author.getNickname()) == null) ? "" : nickname;
                                    String string4 = context2.getString(R.string.en7, objArr);
                                    if (string4 != null) {
                                        str = string4;
                                    }
                                }
                                tuxTextView.setText(str);
                            } else {
                                o.LJIJI("feedReplyText");
                                throw null;
                            }
                        }
                        View view2 = this.LJZ;
                        if (view2 != null) {
                            view2.setVisibility(0);
                            Video video2 = aweme.getVideo();
                            if (video2 != null && (cover = video2.getCover()) != null) {
                                W5F LJII = W5U.LJII(C78939UyV.LJ(cover));
                                LJII.LJIILIIL(J7H.LIZ(100));
                                SmartImageView smartImageView = this.LJZI;
                                if (smartImageView != null) {
                                    LJII.LJJIIJ = smartImageView;
                                    int width = smartImageView.getWidth();
                                    SmartImageView smartImageView2 = this.LJZI;
                                    if (smartImageView2 != null) {
                                        int height = smartImageView2.getHeight();
                                        LJII.LJII = width;
                                        LJII.LJIIIIZZ = height;
                                        LJII.LIZIZ("DetailFeedInputView");
                                        C16880lQ.LLJJJ(LJII);
                                        if (C76800UCe.LIZ != null) {
                                            return;
                                        }
                                    } else {
                                        o.LJIJI("feedReplyVideo");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("feedReplyVideo");
                                    throw null;
                                }
                            }
                        } else {
                            o.LJIJI("feedReplyLayout");
                            throw null;
                        }
                    }
                    View view3 = this.LJZ;
                    if (view3 != null) {
                        view3.setVisibility(8);
                        return;
                    } else {
                        o.LJIJI("feedReplyLayout");
                        throw null;
                    }
                }
                Serializable serializable2 = bundle.getSerializable("user");
                if (!(serializable2 instanceof User) || (user = (User) serializable2) == null) {
                    return;
                }
                View view4 = this.LJZ;
                if (view4 != null) {
                    view4.setVisibility(8);
                    ViewStub viewStub = this.LL;
                    if (viewStub != null) {
                        this.LLD = viewStub.inflate();
                        this.LL = null;
                    }
                    View view5 = this.LLD;
                    if (view5 == null) {
                        return;
                    }
                    C16880lQ.LJIIJ(new View.OnClickListener() { // from class: X.4C4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view6) {
                        }
                    }, view5);
                    view5.setEnabled(false);
                    if (bundle.getBoolean("fromQuickDmOnStory")) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3) {
                        C105784De sharer_avatar = (C105784De) view5.findViewById(R.id.jvp);
                        o.LJIIIIZZ(sharer_avatar, "sharer_avatar");
                        C105784De.LIZIZ(sharer_avatar, C78939UyV.LJ(user.getAvatarThumb()), null, 60);
                        ((C105784De) view5.findViewById(R.id.jvp)).setIconSize(O6R.LJJIIZ(C32151Nz.LJIIZILJ(14)));
                        ((C105784De) view5.findViewById(R.id.jvp)).setIconRes(R.raw.icon_color_paperplane_circle);
                        ((ImageView) view5.findViewById(R.id.jvr)).setVisibility(8);
                        ((TextView) view5.findViewById(R.id.iwg)).setText(view5.getContext().getString(R.string.gzj, user.getNickname()));
                        return;
                    }
                    view5.findViewById(R.id.jvp).setVisibility(8);
                    Serializable serializable3 = bundle.getSerializable("video");
                    if (serializable3 instanceof Aweme) {
                        aweme2 = (Aweme) serializable3;
                    } else {
                        aweme2 = null;
                    }
                    C62846OlW c62846OlW = (C62846OlW) view5.findViewById(R.id.jvr);
                    if (aweme2 != null && (video = aweme2.getVideo()) != null) {
                        urlModel = video.getCover();
                    }
                    C78765Uvh.LJFF(c62846OlW, urlModel);
                    ((ImageView) view5.findViewById(R.id.jvr)).setVisibility(0);
                    ((TextView) view5.findViewById(R.id.iwg)).setText(view5.getContext().getString(R.string.en7, user.getNickname()));
                    return;
                }
                o.LJIJI("feedReplyLayout");
                throw null;
            }
            return;
        }
        o.LJIJI("feedReplyLayout");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView, X.InterfaceC1032943p
    public final void LJIIL(View view, int i, int i2, boolean z) {
        super.LJIIL(view, i, i2, z);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onPanelChange is called: panel type is ");
        LIZ.append(i2);
        C34B.LJI("DetailFeedInputView", X1D.LIZIZ(LIZ));
        if (i2 == -1) {
            DetailFeedKeyboardDialogFragment detailFeedKeyboardDialogFragment = this.LLFII;
            if ((detailFeedKeyboardDialogFragment instanceof DetailFeedKeyboardDialogFragment) && detailFeedKeyboardDialogFragment != null) {
                detailFeedKeyboardDialogFragment.dismiss();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        DetailFeedKeyboardDialogFragment detailFeedKeyboardDialogFragment;
        InterfaceC92953kp interfaceC92953kp;
        C87687YbD.LIZ.getClass();
        if (C87687YbD.LIZ()) {
            if ((i3 != 0 || i != 0) && (detailFeedKeyboardDialogFragment = this.LLFII) != null && (interfaceC92953kp = detailFeedKeyboardDialogFragment.LJLLLL) != null) {
                interfaceC92953kp.ne();
            }
        }
    }
}
