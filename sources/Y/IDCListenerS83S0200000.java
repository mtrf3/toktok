package Y;

import X.B83;
import X.BDG;
import X.BZI;
import X.C006600w;
import X.C05270Ip;
import X.C05960Lg;
import X.C06460Ne;
import X.C06540Nm;
import X.C09730Zt;
import X.C0KG;
import X.C0NB;
import X.C0TM;
import X.C0WF;
import X.C0XU;
import X.C12B;
import X.C14270hD;
import X.C14370hN;
import X.C162476Zf;
import X.C19E;
import X.C1GN;
import X.C1GO;
import X.C1HK;
import X.C28408BCy;
import X.C28787BRn;
import X.C28906BWc;
import X.C28907BWd;
import X.C29041BaX;
import X.C29306Beo;
import X.C29374Bfu;
import X.C2BX;
import X.C30522ByQ;
import X.C30531Ht;
import X.C30711Il;
import X.C30868C9o;
import X.C30922CBq;
import X.C32041No;
import X.C32537Cpp;
import X.C33501Te;
import X.C37351dL;
import X.C38951fv;
import X.C41061jK;
import X.C47121t6;
import X.C48971w5;
import X.C49531wz;
import X.C51029K0z;
import X.C76800UCe;
import X.C77357UXp;
import X.C77412UZs;
import X.DialogC30679C2h;
import X.EnumC12710eh;
import X.EnumC264412a;
import X.InterfaceC30442Bx8;
import X.InterfaceC88472Yns;
import X.ORZ;
import X.QZP;
import X.X1D;
import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.broadcast.api.blockword.model.BlockWord;
import com.bytedance.android.live.broadcast.fragment.GameDualDevicePositionSelectFragment;
import com.bytedance.android.live.broadcast.model.PushStreamInfo;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.design.view.sheet.action.LiveActionSheetDialog;
import com.bytedance.android.live.effect.music.entity.Album;
import com.bytedance.android.livesdk.dataChannel.AudienceLastSelectDefinitionInfo;
import com.bytedance.android.livesdk.dataChannel.BroadcastShareScreenDefinition;
import com.bytedance.android.livesdk.dataChannel.GamePreparationSelectDefinitionEvent;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import defpackage.b1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AqS136S0200000_5;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public class IDCListenerS83S0200000 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            case 2:
                onClick$2(this, view);
                return;
            case 3:
                onClick$3(this, view);
                return;
            case 4:
                onClick$4(this, view);
                return;
            case 5:
                onClick$5(this, view);
                return;
            case 6:
                onClick$6(this, view);
                return;
            case 7:
                onClick$7(this, view);
                return;
            case 8:
                onClick$8(this, view);
                return;
            case 9:
                onClick$9(this, view);
                return;
            case 10:
                onClick$10(this, view);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onClick$11(this, view);
                return;
            case 12:
                onClick$12(this, view);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                onClick$13(this, view);
                return;
            default:
                return;
        }
    }

    public IDCListenerS83S0200000(C19E c19e, int i) {
        this.$t = i;
        this.l1 = c19e;
        final Context context = c19e.LIZ.getContext();
        final CharSequence charSequence = c19e.LJIIIIZZ;
        this.l0 = new C0XU(context, charSequence) { // from class: X.1dL
            public CharSequence LIZ;
            public CharSequence LIZIZ;
            public Intent LIZJ;
            public char LIZLLL;
            public char LJFF;
            public Drawable LJII;
            public final Context LJIIIIZZ;
            public CharSequence LJIIIZ;
            public CharSequence LJIIJ;
            public ColorStateList LJIIJJI;
            public PorterDuff.Mode LJIIL;
            public boolean LJIILIIL;
            public boolean LJIILJJIL;
            public int LJ = 4096;
            public int LJI = 4096;
            public int LJIILL = 16;

            @Override // X.C0XU
            public final AbstractC16150kF LIZ() {
                return null;
            }

            @Override // X.C0XU, android.view.MenuItem
            public final boolean collapseActionView() {
                return false;
            }

            @Override // X.C0XU, android.view.MenuItem
            public final boolean expandActionView() {
                return false;
            }

            @Override // X.C0XU, android.view.MenuItem
            public final View getActionView() {
                return null;
            }

            @Override // android.view.MenuItem
            public final int getGroupId() {
                return 0;
            }

            @Override // android.view.MenuItem
            public final int getItemId() {
                return R.id.home;
            }

            @Override // android.view.MenuItem
            public final ContextMenu.ContextMenuInfo getMenuInfo() {
                return null;
            }

            @Override // android.view.MenuItem
            public final int getOrder() {
                return 0;
            }

            @Override // android.view.MenuItem
            public final SubMenu getSubMenu() {
                return null;
            }

            @Override // android.view.MenuItem
            public final boolean hasSubMenu() {
                return false;
            }

            @Override // X.C0XU, android.view.MenuItem
            public final boolean isActionViewExpanded() {
                return false;
            }

            @Override // android.view.MenuItem
            public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
                return this;
            }

            @Override // X.C0XU, android.view.MenuItem
            public final void setShowAsAction(int i2) {
            }

            @Override // X.C0XU, android.view.MenuItem
            public final MenuItem setShowAsActionFlags(int i2) {
                return this;
            }

            public final void LIZJ() {
                Drawable drawable = this.LJII;
                if (drawable != null) {
                    if (this.LJIILIIL || this.LJIILJJIL) {
                        Drawable LJFF = C07840Sm.LJFF(drawable);
                        this.LJII = LJFF;
                        Drawable mutate = LJFF.mutate();
                        this.LJII = mutate;
                        if (this.LJIILIIL) {
                            C07820Sk.LJII(mutate, this.LJIIJJI);
                        }
                        if (this.LJIILJJIL) {
                            C07820Sk.LJIIIIZZ(this.LJII, this.LJIIL);
                        }
                    }
                }
            }

            @Override // android.view.MenuItem
            public final ActionProvider getActionProvider() {
                throw new UnsupportedOperationException();
            }

            @Override // android.view.MenuItem
            public final CharSequence getTitleCondensed() {
                CharSequence charSequence2 = this.LIZIZ;
                if (charSequence2 != null) {
                    return charSequence2;
                }
                return this.LIZ;
            }

            @Override // android.view.MenuItem
            public final boolean isCheckable() {
                if ((this.LJIILL & 1) != 0) {
                    return true;
                }
                return false;
            }

            @Override // android.view.MenuItem
            public final boolean isChecked() {
                if ((this.LJIILL & 2) != 0) {
                    return true;
                }
                return false;
            }

            @Override // android.view.MenuItem
            public final boolean isEnabled() {
                if ((this.LJIILL & 16) != 0) {
                    return true;
                }
                return false;
            }

            @Override // android.view.MenuItem
            public final boolean isVisible() {
                if ((this.LJIILL & 8) == 0) {
                    return true;
                }
                return false;
            }

            @Override // X.C0XU, android.view.MenuItem
            public final int getAlphabeticModifiers() {
                return this.LJI;
            }

            @Override // android.view.MenuItem
            public final char getAlphabeticShortcut() {
                return this.LJFF;
            }

            @Override // X.C0XU, android.view.MenuItem
            public final CharSequence getContentDescription() {
                return this.LJIIIZ;
            }

            @Override // android.view.MenuItem
            public final Drawable getIcon() {
                return this.LJII;
            }

            @Override // X.C0XU, android.view.MenuItem
            public final ColorStateList getIconTintList() {
                return this.LJIIJJI;
            }

            @Override // X.C0XU, android.view.MenuItem
            public final PorterDuff.Mode getIconTintMode() {
                return this.LJIIL;
            }

            @Override // android.view.MenuItem
            public final Intent getIntent() {
                return this.LIZJ;
            }

            @Override // X.C0XU, android.view.MenuItem
            public final int getNumericModifiers() {
                return this.LJ;
            }

            @Override // android.view.MenuItem
            public final char getNumericShortcut() {
                return this.LIZLLL;
            }

            @Override // android.view.MenuItem
            public final CharSequence getTitle() {
                return this.LIZ;
            }

            @Override // X.C0XU, android.view.MenuItem
            public final CharSequence getTooltipText() {
                return this.LJIIJ;
            }

            @Override // X.C0XU
            public final C0XU LIZIZ(AbstractC16150kF abstractC16150kF) {
                throw new UnsupportedOperationException();
            }

            @Override // android.view.MenuItem
            public final MenuItem setActionProvider(ActionProvider actionProvider) {
                throw new UnsupportedOperationException();
            }

            @Override // X.C0XU, android.view.MenuItem
            public final MenuItem setActionView(int i2) {
                throw new UnsupportedOperationException();
            }

            @Override // android.view.MenuItem
            public final MenuItem setAlphabeticShortcut(char c) {
                this.LJFF = Character.toLowerCase(c);
                return this;
            }

            @Override // android.view.MenuItem
            public final MenuItem setCheckable(boolean z) {
                this.LJIILL = (z ? 1 : 0) | (this.LJIILL & (-2));
                return this;
            }

            @Override // android.view.MenuItem
            public final MenuItem setChecked(boolean z) {
                int i2;
                int i3 = this.LJIILL & (-3);
                if (z) {
                    i2 = 2;
                } else {
                    i2 = 0;
                }
                this.LJIILL = i2 | i3;
                return this;
            }

            @Override // X.C0XU, android.view.MenuItem
            public final C0XU setContentDescription(CharSequence charSequence2) {
                this.LJIIIZ = charSequence2;
                return this;
            }

            @Override // android.view.MenuItem
            public final MenuItem setEnabled(boolean z) {
                int i2;
                int i3 = this.LJIILL & (-17);
                if (z) {
                    i2 = 16;
                } else {
                    i2 = 0;
                }
                this.LJIILL = i2 | i3;
                return this;
            }

            @Override // android.view.MenuItem
            public final MenuItem setIcon(int i2) {
                this.LJII = C04270Et.LIZIZ(this.LJIIIIZZ, i2);
                LIZJ();
                return this;
            }

            @Override // X.C0XU, android.view.MenuItem
            public final MenuItem setIconTintList(ColorStateList colorStateList) {
                this.LJIIJJI = colorStateList;
                this.LJIILIIL = true;
                LIZJ();
                return this;
            }

            @Override // X.C0XU, android.view.MenuItem
            public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
                this.LJIIL = mode;
                this.LJIILJJIL = true;
                LIZJ();
                return this;
            }

            @Override // android.view.MenuItem
            public final MenuItem setIntent(Intent intent) {
                this.LIZJ = intent;
                return this;
            }

            @Override // android.view.MenuItem
            public final MenuItem setNumericShortcut(char c) {
                this.LIZLLL = c;
                return this;
            }

            @Override // android.view.MenuItem
            public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
                throw new UnsupportedOperationException();
            }

            @Override // android.view.MenuItem
            public final MenuItem setTitle(int i2) {
                this.LIZ = this.LJIIIIZZ.getResources().getString(i2);
                return this;
            }

            @Override // android.view.MenuItem
            public final MenuItem setTitleCondensed(CharSequence charSequence2) {
                this.LIZIZ = charSequence2;
                return this;
            }

            @Override // X.C0XU, android.view.MenuItem
            public final C0XU setTooltipText(CharSequence charSequence2) {
                this.LJIIJ = charSequence2;
                return this;
            }

            @Override // android.view.MenuItem
            public final MenuItem setVisible(boolean z) {
                int i2 = 8;
                int i3 = this.LJIILL & 8;
                if (z) {
                    i2 = 0;
                }
                this.LJIILL = i3 | i2;
                return this;
            }

            @Override // X.C0XU, android.view.MenuItem
            public final MenuItem setActionView(View view) {
                throw new UnsupportedOperationException();
            }

            @Override // android.view.MenuItem
            public final MenuItem setContentDescription(CharSequence charSequence2) {
                this.LJIIIZ = charSequence2;
                return this;
            }

            @Override // android.view.MenuItem
            public final MenuItem setIcon(Drawable drawable) {
                this.LJII = drawable;
                LIZJ();
                return this;
            }

            @Override // android.view.MenuItem
            public final MenuItem setTitle(CharSequence charSequence2) {
                this.LIZ = charSequence2;
                return this;
            }

            @Override // android.view.MenuItem
            public final MenuItem setTooltipText(CharSequence charSequence2) {
                this.LJIIJ = charSequence2;
                return this;
            }

            {
                this.LJIIIIZZ = context;
                this.LIZ = charSequence;
            }

            @Override // X.C0XU, android.view.MenuItem
            public final MenuItem setAlphabeticShortcut(char c, int i2) {
                this.LJFF = Character.toLowerCase(c);
                this.LJI = KeyEvent.normalizeMetaState(i2);
                return this;
            }

            @Override // X.C0XU, android.view.MenuItem
            public final MenuItem setNumericShortcut(char c, int i2) {
                this.LIZLLL = c;
                this.LJ = KeyEvent.normalizeMetaState(i2);
                return this;
            }

            @Override // android.view.MenuItem
            public final MenuItem setShortcut(char c, char c2) {
                this.LIZLLL = c;
                this.LJFF = Character.toLowerCase(c2);
                return this;
            }

            @Override // X.C0XU, android.view.MenuItem
            public final MenuItem setShortcut(char c, char c2, int i2, int i3) {
                this.LIZLLL = c;
                this.LJ = KeyEvent.normalizeMetaState(i2);
                this.LJFF = Character.toLowerCase(c2);
                this.LJI = KeyEvent.normalizeMetaState(i3);
                return this;
            }
        };
    }

    public static final void onClick$0(IDCListenerS83S0200000 iDCListenerS83S0200000, View view) {
        C19E c19e = (C19E) iDCListenerS83S0200000.l1;
        Window.Callback callback = c19e.LJIIJJI;
        if (callback != null && c19e.LJIIL) {
            callback.onMenuItemSelected(0, (C37351dL) iDCListenerS83S0200000.l0);
        }
    }

    public static final void onClick$1(IDCListenerS83S0200000 iDCListenerS83S0200000, View view) {
        InterfaceC88472Yns<? super BlockWord, C76800UCe> interfaceC88472Yns = ((C05270Ip) iDCListenerS83S0200000.l0).LJLLILLLL;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke((BlockWord) iDCListenerS83S0200000.l1);
        }
    }

    public static final void onClick$10(IDCListenerS83S0200000 iDCListenerS83S0200000, View view) {
        C33501Te c33501Te = (C33501Te) iDCListenerS83S0200000.l0;
        long j = c33501Te.LJLJJI;
        long j2 = ((Album) iDCListenerS83S0200000.l1).id;
        if (j == j2) {
            return;
        }
        c33501Te.LJLJJI = j2;
        c33501Te.notifyDataSetChanged();
        if (C14270hD.LLD) {
            C14370hN.LIZIZ(false);
        }
        ((C33501Te) iDCListenerS83S0200000.l0).LJLILLLLZI.invoke((Album) iDCListenerS83S0200000.l1);
        C33501Te c33501Te2 = (C33501Te) iDCListenerS83S0200000.l0;
        DataChannel dataChannel = c33501Te2.LJLIL;
        long j3 = c33501Te2.LJLJJI;
        String tab = ((Album) iDCListenerS83S0200000.l1).name;
        o.LJIIIZ(tab, "tab");
        BZI LIZ = C28787BRn.LIZ("livesdk_anchor_ksong_tab_click");
        LIZ.LJIILLIIL(dataChannel);
        LIZ.LJIJJ(String.valueOf(j3), "collection_id");
        LIZ.LJIJJ(tab, "tab");
        LIZ.LJJIIJZLJL();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Integer, O] */
    public static final void onClick$11(IDCListenerS83S0200000 iDCListenerS83S0200000, View view) {
        Iterator it = ((ArrayList) iDCListenerS83S0200000.l0).iterator();
        while (it.hasNext()) {
            ImageView imageView = (ImageView) it.next();
            if (!o.LJ(imageView, view)) {
                imageView.setSelected(false);
                imageView.setImageDrawable(null);
            }
        }
        Object tag = view.getTag();
        if (tag instanceof EnumC12710eh) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("select tag =");
            LIZ.append(tag);
            LIZ.append(" ordinal = ");
            EnumC12710eh enumC12710eh = (EnumC12710eh) tag;
            LIZ.append(enumC12710eh.ordinal());
            LIZ.append(" ,isLandscape = ");
            LIZ.append(((Boolean) ((GameDualDevicePositionSelectFragment) iDCListenerS83S0200000.l1).LJLIL.getValue()).booleanValue());
            C0NB.LJIIIZ("GameDualDevicePositionSelect", X1D.LIZIZ(LIZ));
            GameDualDevicePositionSelectFragment gameDualDevicePositionSelectFragment = (GameDualDevicePositionSelectFragment) iDCListenerS83S0200000.l1;
            int ordinal = enumC12710eh.ordinal();
            gameDualDevicePositionSelectFragment.getClass();
            DataChannel LJIILIIL = C51029K0z.LJIILIIL(gameDualDevicePositionSelectFragment);
            if (LJIILIIL != null) {
                ((C32537Cpp) LJIILIIL.gv0(C28408BCy.class)).LIZ = Integer.valueOf(ordinal);
            }
            gameDualDevicePositionSelectFragment.LJLILLLLZI = ordinal;
        }
        view.setSelected(true);
        if (view instanceof ImageView) {
            ((GameDualDevicePositionSelectFragment) iDCListenerS83S0200000.l1).vl((ImageView) view);
        }
    }

    public static final void onClick$12(IDCListenerS83S0200000 iDCListenerS83S0200000, View view) {
        LiveDialog liveDialog = (LiveDialog) iDCListenerS83S0200000.l0;
        C006600w c006600w = (C006600w) iDCListenerS83S0200000.l1;
        liveDialog.getClass();
        c006600w.LIZJ.LJIILLIIL(liveDialog);
    }

    public static final void onClick$13(IDCListenerS83S0200000 iDCListenerS83S0200000, View view) {
        C38951fv c38951fv = (C38951fv) iDCListenerS83S0200000.l0;
        c38951fv.LIZJ.LIZ((DialogInterface) iDCListenerS83S0200000.l1);
    }

    public static final void onClick$2(IDCListenerS83S0200000 iDCListenerS83S0200000, View view) {
        String str;
        RecyclerView.ViewHolder viewHolder;
        C1GN c1gn;
        C41061jK c41061jK;
        C1GN c1gn2;
        C41061jK c41061jK2;
        Map map;
        String str2;
        C1GO c1go = (C1GO) iDCListenerS83S0200000.l0;
        C1GN c1gn3 = (C1GN) iDCListenerS83S0200000.l1;
        if (c1go.LJLJJLL) {
            return;
        }
        DataChannel dataChannel = c1go.LJLJI;
        if (dataChannel != null) {
            dataChannel.pv0(GamePreparationSelectDefinitionEvent.class);
        }
        int bindingAdapterPosition = c1gn3.getBindingAdapterPosition();
        int i = c1go.LJLJJL;
        if (bindingAdapterPosition == i) {
            return;
        }
        c1go.LJLJJLL = true;
        String str3 = ((C09730Zt) ListProtector.get(c1go.LJLILLLLZI, bindingAdapterPosition)).LIZJ;
        String str4 = ((C09730Zt) ListProtector.get(c1go.LJLILLLLZI, i)).LIZJ;
        if (str4 == null) {
            str4 = "";
        }
        if (C30922CBq.LIZIZ) {
            StringBuilder LIZJ = C06460Ne.LIZJ("handleAnchorItemSelect. oldPosition=", i, ". ; newPosition=", bindingAdapterPosition, ",  newResolution=");
            LIZJ.append(str3);
            LIZJ.append('.');
            C0NB.LJIIIZ("GamePreparationDefinitionDialogTag", X1D.LIZIZ(LIZJ));
        }
        PushStreamInfo.Quality quality = new PushStreamInfo.Quality();
        quality.sdkKey = ((C09730Zt) ListProtector.get(c1go.LJLILLLLZI, bindingAdapterPosition)).LIZJ;
        quality.name = ((C09730Zt) ListProtector.get(c1go.LJLILLLLZI, bindingAdapterPosition)).LIZ;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        dataChannelGlobal.tv0(BroadcastShareScreenDefinition.class, quality);
        HashMap hashMap = new HashMap();
        String str5 = quality.name;
        o.LJIIIIZZ(str5, "quality.name");
        hashMap.put("name", str5);
        String str6 = quality.sdkKey;
        o.LJIIIIZZ(str6, "quality.sdkKey");
        hashMap.put("sdk_key", str6);
        InterfaceC30442Bx8.LLLZI.LIZ(hashMap);
        String str7 = quality.sdkKey;
        o.LJIIIIZZ(str7, "quality.sdkKey");
        DataChannel dataChannel2 = c1go.LJLJI;
        if (dataChannel2 != null && (map = (Map) dataChannel2.kv0(AudienceLastSelectDefinitionInfo.class)) != null && (str2 = (String) map.get("sdk_key")) != null) {
            str4 = str2;
        }
        boolean LJ = o.LJ(C77357UXp.LJIJI(), str7);
        if (LJ) {
            str = "1";
        } else if (!LJ) {
            str = CardStruct.IStatusCode.DEFAULT;
        } else {
            throw new C162476Zf();
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_live_anchor_definition_selection_select_success");
        C06540Nm.LJFF((C29374Bfu) B83.LIZ().LIZIZ(), LIZ, "anchor_id", str4, "previous_definition");
        LIZ.LJIJJ(str7, "current_definition");
        LIZ.LJIJJ("click", "switch_type");
        LIZ.LJIJJ(str, "is_recommend_definition");
        LIZ.LJIJ("screen_share");
        LIZ.LJJIIJZLJL();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("selectItemUI. position=");
        b1.LJ(LIZ2, bindingAdapterPosition, LIZ2, "GamePreparationDefinitionDialogTag");
        ((C09730Zt) ListProtector.get(c1go.LJLILLLLZI, bindingAdapterPosition)).LIZLLL = true;
        RecyclerView recyclerView = c1go.LJLIL;
        RecyclerView.ViewHolder viewHolder2 = null;
        if (recyclerView != null) {
            viewHolder = recyclerView.LJJIZ(bindingAdapterPosition);
        } else {
            viewHolder = null;
        }
        if ((viewHolder instanceof C1GN) && (c1gn2 = (C1GN) viewHolder) != null) {
            ConstraintLayout constraintLayout = c1gn2.LJLIL;
            if (constraintLayout != null) {
                constraintLayout.setSelected(true);
            }
            if (c1gn2 != null) {
                C47121t6 c47121t6 = c1gn2.LJLILLLLZI;
                if (c47121t6 != null) {
                    c47121t6.setSelected(true);
                }
                if (c1gn2 != null && (c41061jK2 = c1gn2.LJLJJL) != null) {
                    c41061jK2.setChecked(true);
                }
            }
        }
        QZP.LIZJ("unSelectItem. position=", i, "GamePreparationDefinitionDialogTag");
        ((C09730Zt) ListProtector.get(c1go.LJLILLLLZI, i)).LIZLLL = false;
        RecyclerView recyclerView2 = c1go.LJLIL;
        if (recyclerView2 != null) {
            viewHolder2 = recyclerView2.LJJIZ(i);
        }
        if ((viewHolder2 instanceof C1GN) && (c1gn = (C1GN) viewHolder2) != null) {
            ConstraintLayout constraintLayout2 = c1gn.LJLIL;
            if (constraintLayout2 != null) {
                constraintLayout2.setSelected(false);
            }
            if (c1gn != null) {
                C47121t6 c47121t62 = c1gn.LJLILLLLZI;
                if (c47121t62 != null) {
                    c47121t62.setSelected(false);
                }
                if (c1gn != null && (c41061jK = c1gn.LJLJJL) != null) {
                    c41061jK.setChecked(false);
                }
            }
        }
        c1go.LJLJJL = bindingAdapterPosition;
        c1go.LJLJJI.LLLLLJLJLL();
        c1go.LJLJJLL = false;
        if (!C77357UXp.LJJIII()) {
            return;
        }
        ((C32537Cpp) dataChannelGlobal.gv0(C29041BaX.class)).LIZ = "";
    }

    public static final void onClick$3(IDCListenerS83S0200000 iDCListenerS83S0200000, View view) {
        BZI LIZ = C28787BRn.LIZ("livesdk_enter_live_appeal_page");
        LIZ.LJIIZILJ();
        LIZ.LJIJJ("popup", "enter_from");
        LIZ.LJIJJ("general", "appeal_type");
        LIZ.LJJIIJZLJL();
        C28907BWd c28907BWd = (C28907BWd) iDCListenerS83S0200000.l0;
        Context context = (Context) iDCListenerS83S0200000.l1;
        IDqS416S0100000 iDqS416S0100000 = new IDqS416S0100000(context, 95);
        String str = c28907BWd.LIZLLL;
        o.LJIIIZ(context, "context");
        C28906BWc.LIZ(context, c28907BWd.LIZJ, str, "toast", new AqS136S0200000_5(c28907BWd, iDqS416S0100000, 39));
    }

    public static final void onClick$4(IDCListenerS83S0200000 iDCListenerS83S0200000, View view) {
        Boolean bool;
        String str;
        LiveEffect liveEffect = ((C05960Lg) iDCListenerS83S0200000.l0).LJLJJL;
        if (liveEffect != null) {
            bool = Boolean.valueOf(liveEffect.isGreenScreen);
        } else {
            bool = null;
        }
        if (C29306Beo.LJJIFFI(bool) && ((C05960Lg) iDCListenerS83S0200000.l0).LJLJLJ) {
            DataChannel dataChannel = (DataChannel) iDCListenerS83S0200000.l1;
            if (dataChannel == null || (str = (String) dataChannel.kv0(BDG.class)) == null) {
                str = "";
            }
            C30868C9o.LJIIL(str, view, com.zhiliaoapp.musically.R.drawable.czc);
            return;
        }
        if (view.getVisibility() != 0) {
            return;
        }
        ((C05960Lg) iDCListenerS83S0200000.l0).getMIconIV().getClass();
        if (C1HK.LJLJI) {
            return;
        }
        C05960Lg c05960Lg = (C05960Lg) iDCListenerS83S0200000.l0;
        c05960Lg.LIZIZ(c05960Lg.LJLJJL, !c05960Lg.LJLJJI, new IDqS420S0100000(c05960Lg, 72));
    }

    public static final void onClick$5(IDCListenerS83S0200000 iDCListenerS83S0200000, View view) {
        C30522ByQ c30522ByQ = LiveEffect.Companion;
        LiveEffect liveEffect = ((C30711Il) iDCListenerS83S0200000.l0).LJLJJI;
        LiveEffect liveEffect2 = (LiveEffect) iDCListenerS83S0200000.l1;
        c30522ByQ.getClass();
        if (!C30522ByQ.LIZ(liveEffect, liveEffect2)) {
            ((C32537Cpp) DataChannelGlobal.LJLJJI.gv0(C2BX.class)).LIZ = CardStruct.IStatusCode.DEFAULT;
            C30711Il c30711Il = (C30711Il) iDCListenerS83S0200000.l0;
            c30711Il.LJLJJL = c30711Il.LJLJJI;
            c30711Il.LJLLLLLL((LiveEffect) iDCListenerS83S0200000.l1);
            C30711Il c30711Il2 = (C30711Il) iDCListenerS83S0200000.l0;
            C0WF c0wf = c30711Il2.LJLJI;
            if (c0wf != null) {
                c0wf.LJJIIJ(c30711Il2.LJLIL, c30711Il2.LJLJJL, (LiveEffect) iDCListenerS83S0200000.l1);
            }
            ((C30711Il) iDCListenerS83S0200000.l0).LJLZ((LiveEffect) iDCListenerS83S0200000.l1);
            C30711Il c30711Il3 = (C30711Il) iDCListenerS83S0200000.l0;
            c30711Il3.LJLJJI = (LiveEffect) iDCListenerS83S0200000.l1;
            c30711Il3.notifyDataSetChanged();
        }
    }

    public static final void onClick$6(IDCListenerS83S0200000 iDCListenerS83S0200000, View view) {
        C29306Beo.LJJLIIIJJI(((C30531Ht) ((RecyclerView.ViewHolder) iDCListenerS83S0200000.l0)).LJLIL, true);
        C48971w5 c48971w5 = (C48971w5) iDCListenerS83S0200000.l1;
        c48971w5.LLFII(ORZ.LJZ(c48971w5.LJLJJL, c48971w5.LJLIL));
        InterfaceC88472Yns<? super LiveEffect, C76800UCe> interfaceC88472Yns = ((C48971w5) iDCListenerS83S0200000.l1).LJLJLLL;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(null);
        }
        ((C48971w5) iDCListenerS83S0200000.l1).LJLJJL = null;
    }

    public static final void onClick$7(IDCListenerS83S0200000 iDCListenerS83S0200000, View view) {
        ((DialogC30679C2h) iDCListenerS83S0200000.l1).dismiss();
        C12B.LIZ(((C0TM) iDCListenerS83S0200000.l0).LIZIZ, false, EnumC264412a.LIVE_TIP_MESSAGE_VOLUME.ordinal(), "", 8);
    }

    public static final void onClick$8(IDCListenerS83S0200000 iDCListenerS83S0200000, View view) {
        if (!C77412UZs.LJJIII(((C49531wz) iDCListenerS83S0200000.l0).LJLJJL)) {
            C32041No.LJIIL(((C49531wz) iDCListenerS83S0200000.l0).LLD, "shortcut_cancel");
            C29306Beo.LJJLIIIJJI(((C30531Ht) ((RecyclerView.ViewHolder) iDCListenerS83S0200000.l1)).LJLIL, true);
            C49531wz c49531wz = (C49531wz) iDCListenerS83S0200000.l0;
            c49531wz.LLFII(ORZ.LJZ(c49531wz.LJLJJL, c49531wz.LJLIL));
            InterfaceC88472Yns<? super LiveEffect, C76800UCe> interfaceC88472Yns = ((C49531wz) iDCListenerS83S0200000.l0).LJLJLLL;
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(null);
            }
            ((C49531wz) iDCListenerS83S0200000.l0).LJLJJL = null;
        }
    }

    public static final void onClick$9(IDCListenerS83S0200000 iDCListenerS83S0200000, View view) {
        LiveActionSheetDialog liveActionSheetDialog = (LiveActionSheetDialog) iDCListenerS83S0200000.l0;
        C0KG c0kg = (C0KG) iDCListenerS83S0200000.l1;
        liveActionSheetDialog.getClass();
        c0kg.LIZJ.LJ(view, c0kg, liveActionSheetDialog);
    }

    public IDCListenerS83S0200000(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}
