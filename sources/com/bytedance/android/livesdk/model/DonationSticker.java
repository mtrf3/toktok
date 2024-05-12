package com.bytedance.android.livesdk.model;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class DonationSticker {

    @InterfaceC65349Pkn("content")
    public OrganizationModel content;

    @InterfaceC65349Pkn("id")
    public long id;

    @InterfaceC65349Pkn("image")
    public ImageModel image;

    @InterfaceC65349Pkn("kind")
    public long kind;

    @InterfaceC65349Pkn("max_length")
    public long maxLength;

    @InterfaceC65349Pkn("h")
    public int screenHeight;

    @InterfaceC65349Pkn("w")
    public int screenWidth;

    @InterfaceC65349Pkn("sit_rect")
    public List<Double> sit_rect;

    @InterfaceC65349Pkn("status")
    public long status;

    @InterfaceC65349Pkn("sub_type")
    public Long subType;

    @InterfaceC65349Pkn("text_color")
    public String textColor;

    @InterfaceC65349Pkn("text_size")
    public int textSize;

    @InterfaceC65349Pkn("type")
    public int type;

    @InterfaceC65349Pkn("input_rect")
    public List<Long> inputRect = new ArrayList();

    @InterfaceC65349Pkn("x")
    public int x = -1;

    @InterfaceC65349Pkn("y")
    public int y = -1;

    public final RoomDecoration LIZ() {
        String str;
        RoomDecoration roomDecoration = new RoomDecoration(null, 0L, null, 0L, 0L, null, 63, null);
        roomDecoration.image = this.image;
        roomDecoration.textColor = this.textColor;
        roomDecoration.textSize = this.textSize;
        if (this.content != null) {
            str = GsonProtectorUtils.toJson(new Gson(), this.content);
            o.LJIIIIZZ(str, "Gson().toJson(content)");
        } else {
            str = "";
        }
        roomDecoration.content = str;
        roomDecoration.maxLength = this.maxLength;
        roomDecoration.inputRect = this.inputRect;
        roomDecoration.type = this.type;
        roomDecoration.id = this.id;
        roomDecoration.x = this.x;
        roomDecoration.y = this.y;
        roomDecoration.screenWidth = this.screenWidth;
        roomDecoration.screenHeight = this.screenHeight;
        roomDecoration.status = this.status;
        roomDecoration.kind = this.kind;
        roomDecoration.sit_rect = this.sit_rect;
        return roomDecoration;
    }
}
