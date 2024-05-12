package com.byted.cast.common.bean;

import X.X1D;
import java.util.List;

/* loaded from: classes29.dex */
public class SinkInfoBean {
    public String aid;
    public int audio;
    public int bitrate;
    public String cast_id;
    public String device_id;
    public String device_name;
    public String expand;
    public int fps;
    public int height;
    public List<String> ip;
    public int landscape;
    public int mirror_port;
    public String player_info;
    public int port;
    public String private_channel;
    public String project_id;
    public String protocols;
    public String sdk_version;
    public String session_id;
    public int width;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SinkInfoBean{device_name='");
        LIZ.append(this.device_name);
        LIZ.append('\'');
        LIZ.append(", ip=");
        LIZ.append((Object) "xxx.xxx.xxx.xxx");
        LIZ.append(", port=");
        LIZ.append(this.port);
        LIZ.append(", mirror_port=");
        LIZ.append(this.mirror_port);
        LIZ.append(", cast_id='");
        LIZ.append(this.cast_id);
        LIZ.append('\'');
        LIZ.append(", private_channel='");
        LIZ.append(this.private_channel);
        LIZ.append('\'');
        LIZ.append(", protocols='");
        LIZ.append(this.protocols);
        LIZ.append('\'');
        LIZ.append(", width=");
        LIZ.append(this.width);
        LIZ.append(", height=");
        LIZ.append(this.height);
        LIZ.append(", fps=");
        LIZ.append(this.fps);
        LIZ.append(", audio=");
        LIZ.append(this.audio);
        LIZ.append(", bitrate=");
        LIZ.append(this.bitrate);
        LIZ.append(", landscape=");
        LIZ.append(this.landscape);
        LIZ.append(", aid=");
        LIZ.append(this.aid);
        LIZ.append(", project_id='");
        LIZ.append(this.project_id);
        LIZ.append('\'');
        LIZ.append(", session_id='");
        LIZ.append(this.session_id);
        LIZ.append('\'');
        LIZ.append(", device_id='");
        LIZ.append(this.device_id);
        LIZ.append('\'');
        LIZ.append(", sdk_version='");
        LIZ.append(this.sdk_version);
        LIZ.append('\'');
        LIZ.append(", player_info='");
        LIZ.append(this.player_info);
        LIZ.append('\'');
        LIZ.append(", expand='");
        LIZ.append(this.expand);
        LIZ.append('\'');
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public String getAid() {
        return this.aid;
    }

    public int getAudio() {
        return this.audio;
    }

    public int getBitrate() {
        return this.bitrate;
    }

    public String getCast_id() {
        return this.cast_id;
    }

    public String getDevice_id() {
        return this.device_id;
    }

    public String getDevice_name() {
        return this.device_name;
    }

    public String getExpand() {
        return this.expand;
    }

    public int getFps() {
        return this.fps;
    }

    public int getHeight() {
        return this.height;
    }

    public List<String> getIp() {
        return this.ip;
    }

    public int getLandscape() {
        return this.landscape;
    }

    public int getMirror_port() {
        return this.mirror_port;
    }

    public String getPlayer_info() {
        return this.player_info;
    }

    public int getPort() {
        return this.port;
    }

    public String getPrivate_channel() {
        return this.private_channel;
    }

    public String getProject_id() {
        return this.project_id;
    }

    public String getProtocols() {
        return this.protocols;
    }

    public String getSdk_version() {
        return this.sdk_version;
    }

    public String getSession_id() {
        return this.session_id;
    }

    public int getWidth() {
        return this.width;
    }

    public void setAid(String str) {
        this.aid = str;
    }

    public void setAudio(int i) {
        this.audio = i;
    }

    public void setBitrate(int i) {
        this.bitrate = i;
    }

    public void setCast_id(String str) {
        this.cast_id = str;
    }

    public void setDevice_id(String str) {
        this.device_id = str;
    }

    public void setDevice_name(String str) {
        this.device_name = str;
    }

    public void setExpand(String str) {
        this.expand = str;
    }

    public void setFps(int i) {
        this.fps = i;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setIp(List<String> list) {
        this.ip = list;
    }

    public void setLandscape(int i) {
        this.landscape = i;
    }

    public void setMirror_port(int i) {
        this.mirror_port = i;
    }

    public void setPlayer_info(String str) {
        this.player_info = str;
    }

    public void setPort(int i) {
        this.port = i;
    }

    public void setPrivate_channel(String str) {
        this.private_channel = str;
    }

    public void setProject_id(String str) {
        this.project_id = str;
    }

    public void setProtocols(String str) {
        this.protocols = str;
    }

    public void setSdk_version(String str) {
        this.sdk_version = str;
    }

    public void setSession_id(String str) {
        this.session_id = str;
    }

    public void setWidth(int i) {
        this.width = i;
    }
}
